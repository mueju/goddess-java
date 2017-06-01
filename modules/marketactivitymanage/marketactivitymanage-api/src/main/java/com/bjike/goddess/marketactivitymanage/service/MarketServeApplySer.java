package com.bjike.goddess.marketactivitymanage.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.marketactivitymanage.bo.MarketServeApplyBO;
import com.bjike.goddess.marketactivitymanage.dto.MarketServeApplyDTO;
import com.bjike.goddess.marketactivitymanage.entity.MarketServeApply;
import com.bjike.goddess.marketactivitymanage.to.CustomerInfoTO;
import com.bjike.goddess.marketactivitymanage.to.MarketServeApplyTO;
import com.bjike.goddess.marketactivitymanage.type.AuditType;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * 市场招待申请业务接口
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-03-18T10:37:08.047 ]
 * @Description: [ ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface MarketServeApplySer extends Ser<MarketServeApply, MarketServeApplyDTO> {

    /**
     * 查询市场招待申请
     *
     * @param dto 市场招待申请dto
     * @return class MarketServeApplyBO
     * @throws SerException
     */
    List<MarketServeApplyBO> list(MarketServeApplyDTO dto) throws SerException;

    /**
     * 保存市场招待申请
     *
     * @param to 市场招待申请to
     * @return class MarketServeApplyBO
     * @throws SerException
     */
    MarketServeApplyBO save(MarketServeApplyTO to) throws SerException;

    /**
     * 根据id删除市场招待申请
     *
     * @param id 市场招待申请id
     * @throws SerException
     */
    void remove(String id) throws SerException;

    /**
     * 更新市场招待申请
     *
     * @param to 市场招待申请to
     * @throws SerException
     */
    void update(MarketServeApplyTO to) throws SerException;

    /**
     * 运营商务部资金模块意见
     *
     * @param id 市场招待申请唯一标识
     * @param fundModuleOpinion 运营商务部资金模块意见
     * @throws SerException
     */
    void fundModuleOpinion(String id, String fundModuleOpinion) throws SerException;

    /**
     * 决策层意见
     *
     * @param id 市场招待申请唯一标识
     * @param executiveAuditOpinion 决策层意见
     * @throws SerException
     */
    void executiveOpinion(String id, AuditType executiveAuditOpinion) throws SerException;

    /**
     * 查看详情
     *
     * @param id 市场招待申请唯一标识
     * @return class MarketServeApplyBO
     * @throws SerException
     */
    MarketServeApplyBO checkDetails(String id) throws SerException;

    /**
     * 添加客户信息
     *
     * @param to 客户信息to
     * @throws SerException
     */
    void addClientInfo(CustomerInfoTO to) throws SerException;

    /**
     * 编辑客户信息
     *
     * @param to 客户信息to
     * @throws SerException
     */
    void editClientInfo(CustomerInfoTO to) throws SerException;
}