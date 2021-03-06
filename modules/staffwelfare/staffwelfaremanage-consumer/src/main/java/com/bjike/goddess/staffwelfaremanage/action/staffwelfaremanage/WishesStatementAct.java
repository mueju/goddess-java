package com.bjike.goddess.staffwelfaremanage.action.staffwelfaremanage;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.staffwelfaremanage.api.WishesStatementAPI;
import com.bjike.goddess.staffwelfaremanage.dto.WishesStatementDTO;
import com.bjike.goddess.staffwelfaremanage.to.WishesStatementTO;
import com.bjike.goddess.staffwelfaremanage.vo.WishesStatementVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 祝福语
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-06 03:21 ]
 * @Description: [ 祝福语 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("wishesstatement")
public class WishesStatementAct {
    
    @Autowired
    private WishesStatementAPI wishesStatementAPI;

    /**
     * 新增祝福语
     *
     * @param to 祝福语
     * @version v1
     */
    @PostMapping("v1/add")
    public Result add(WishesStatementTO to, BindingResult bindingResult) throws ActException {
        try {
            WishesStatementVO vo = BeanTransform.copyProperties(wishesStatementAPI.addModel(to), WishesStatementVO.class);
            return ActResult.initialize(vo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑祝福语
     *
     * @param to 祝福语
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result edit(WishesStatementTO to, BindingResult bindingResult) throws ActException {
        try {
            WishesStatementVO vo = BeanTransform.copyProperties(wishesStatementAPI.editModel(to), WishesStatementVO.class);
            return ActResult.initialize(vo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除祝福语
     *
     * @param id 祝福语id
     * @version v1
     */
    @GetMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            wishesStatementAPI.delete(id);
            return new ActResult();
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 祝福语分页查询
     *
     * @param dto 分页条件
     * @version v1
     */
    @GetMapping("v1/pageList")
    public Result pageList(WishesStatementDTO dto) throws ActException {
        try {
            List<WishesStatementVO> voList = BeanTransform.copyProperties(wishesStatementAPI.pageList(dto), WishesStatementVO.class);
            return ActResult.initialize(voList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }
}