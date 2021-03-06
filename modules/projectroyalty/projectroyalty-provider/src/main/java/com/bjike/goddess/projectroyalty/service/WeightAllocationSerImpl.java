package com.bjike.goddess.projectroyalty.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.projectroyalty.bo.OpinionBO;
import com.bjike.goddess.projectroyalty.bo.WeightAllocationBO;
import com.bjike.goddess.projectroyalty.dto.WeightAllocationDTO;
import com.bjike.goddess.projectroyalty.entity.*;
import com.bjike.goddess.projectroyalty.to.WeightAllocationTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目提成权重分配业务实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-06-07 09:12 ]
 * @Description: [ 项目提成权重分配业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "projectroyaltySerCache")
@Service
public class WeightAllocationSerImpl extends ServiceImpl<WeightAllocation, WeightAllocationDTO> implements WeightAllocationSer {

    @Autowired
    private CollectionPeriodSer collectionPeriodSer;
    @Autowired
    private CompletionTimeSer completionTimeSer;
    @Autowired
    private ContractAmountSer contractAmountSer;
    @Autowired
    private FacilitySer facilitySer;
    @Autowired
    private RatioSer ratioSer;

    private void countAllocation(WeightAllocation entity, WeightAllocationTO to) throws SerException {
        CollectionPeriod period = collectionPeriodSer.findById(to.getCycleId());
        if (null == period)
            throw new SerException("回款周期不存在,无法保存");
        CompletionTime completion = completionTimeSer.findById(to.getCompleteId());
        if (null == completion)
            throw new SerException("完工时间不存在,无法保存");
        ContractAmount contract = contractAmountSer.findById(to.getMoneyId());
        if (null == contract)
            throw new SerException("合同金额不存在,无法保存");
        Facility facility = facilitySer.findById(to.getDifficultyId());
        if (null == facility)
            throw new SerException("难易度不存在,无法保存");
        Ratio ratio = ratioSer.findById(to.getRateId());
        if (null == ratio)
            throw new SerException("毛利率不存在,无法保存");
        entity.setCycle(period.getCollection());
        entity.setComplete(completion.getCompletion());
        entity.setMoney(contract.getContract());
        entity.setDifficulty(facility.getFacility());
        entity.setRate(ratio.getRatio());
        entity.setImportance(this.decimal((period.getImportance() + completion.getImportance() +
                contract.getImportance() + facility.getImportance() + ratio.getImportance()) / 5));
        entity.setBusiness(this.decimal((period.getRate() + completion.getRate() +
                contract.getRate() + facility.getRate() + ratio.getRate()) / 5));
        entity.setManage(this.decimal((completion.getManage() + contract.getManage()
                + facility.getManage() + ratio.getManage()) / 4));
        entity.setCapital(period.getCapital());
        entity.setProfit(this.decimal(entity.getMoney() * entity.getRate() / 100));
        entity.setProportion(entity.getImportance() + entity.getBusiness() + entity.getManage() +
                entity.getCapital() + entity.getRisk() + entity.getRate());
        if (entity.getProportion() != 100)
            throw new SerException("当前总比例为" + entity.getProportion() + "%,无法保存");
    }

    private Double decimal(double number) throws SerException {
        return new BigDecimal(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public WeightAllocationBO saveTarget(WeightAllocationTO to) throws SerException {
        WeightAllocation entity = BeanTransform.copyProperties(to, WeightAllocation.class);
        entity.setPlan(Boolean.TRUE);
        this.countAllocation(entity, to);
        super.save(entity);
        return BeanTransform.copyProperties(entity, WeightAllocationBO.class);
    }

    @Override
    public WeightAllocationBO saveActual(WeightAllocationTO to) throws SerException {
        WeightAllocation entity = BeanTransform.copyProperties(to, WeightAllocation.class);
        entity.setPlan(Boolean.FALSE);
        this.countAllocation(entity, to);
        super.save(entity);
        return BeanTransform.copyProperties(entity, WeightAllocationBO.class);
    }

    @Override
    public WeightAllocationBO update(WeightAllocationTO to) throws SerException {
        WeightAllocation entity = super.findById(to.getId());
        if (null == entity)
            throw new SerException("数据不存在");
        BeanTransform.copyProperties(to, entity, true);
        entity.setModifyTime(LocalDateTime.now());
        this.countAllocation(entity, to);
        super.update(entity);
        return BeanTransform.copyProperties(entity, WeightAllocationBO.class);
    }

    @Override
    public WeightAllocationBO delete(String id) throws SerException {
        WeightAllocation entity = super.findById(id);
        if (null == entity)
            throw new SerException("数据不存在");
        super.remove(entity);
        return BeanTransform.copyProperties(entity, WeightAllocationBO.class);
    }

    @Override
    public WeightAllocationBO getById(String id) throws SerException {
        WeightAllocation entity = super.findById(id);
        if (null == entity)
            throw new SerException("数据不存在");
        return BeanTransform.copyProperties(entity, WeightAllocationBO.class);
    }

    @Override
    public List<WeightAllocationBO> targetMaps(WeightAllocationDTO dto) throws SerException {
        dto.getConditions().add(Restrict.eq("plan", !Boolean.TRUE));
        dto.getSorts().add("area=asc");
        dto.getSorts().add("project=asc");
        return BeanTransform.copyProperties(super.findByPage(dto), WeightAllocationBO.class);
    }

    @Override
    public List<WeightAllocationBO> actualMaps(WeightAllocationDTO dto) throws SerException {
        dto.getConditions().add(Restrict.eq("plan", !Boolean.FALSE));
        dto.getSorts().add("area=asc");
        dto.getSorts().add("project=asc");
        return BeanTransform.copyProperties(super.findByPage(dto), WeightAllocationBO.class);
    }

    @Override
    public Long getTargetTotal() throws SerException {
        WeightAllocationDTO dto = new WeightAllocationDTO();
        dto.getConditions().add(Restrict.eq("plan", !Boolean.TRUE));
        return super.count(dto);
    }

    @Override
    public Long getActualTotal() throws SerException {
        WeightAllocationDTO dto = new WeightAllocationDTO();
        dto.getConditions().add(Restrict.eq("plan", !Boolean.FALSE));
        return super.count(dto);
    }

    @Override
    public List<OpinionBO> findTargetOpinion() throws SerException {
        WeightAllocationDTO dto = new WeightAllocationDTO();
        dto.getConditions().add(Restrict.eq("plan", !Boolean.TRUE));
        List<WeightAllocation> list = super.findByCis(dto);
        List<OpinionBO> bos = new ArrayList<>(0);
        for (WeightAllocation entity : list)
            bos.add(new OpinionBO(entity.getId(), String.format("地区:%s 项目:%s", entity.getArea(), entity.getProject())));
        return bos;
    }

    @Override
    public List<OpinionBO> findActualOpinion() throws SerException {
        WeightAllocationDTO dto = new WeightAllocationDTO();
        dto.getConditions().add(Restrict.eq("plan", !Boolean.FALSE));
        List<WeightAllocation> list = super.findByCis(dto);
        List<OpinionBO> bos = new ArrayList<>(0);
        for (WeightAllocation entity : list)
            bos.add(new OpinionBO(entity.getId(), String.format("地区:%s 项目:%s", entity.getArea(), entity.getProject())));
        return bos;
    }
}