package com.bjike.goddess.user.action.rbac;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.user.bo.rbac.PermissionBO;
import com.bjike.goddess.user.service.rbac.PermissionAPI;
import com.bjike.goddess.user.vo.PermissionVO;
import com.dounine.japi.common.springmvc.ApiVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 权限资源操作
 *
 * @Author: [liguiqin]
 * @Date: [2017-01-14 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@RestController
@RequestMapping("{version}/rbac/permission")
public class PermissionAct {
    @Autowired
    private PermissionAPI permissionAPI;

    /**
     * 异步获取权限资源树结构,逐层加载,参考ztree
     *
     * @param id 通过自身id查询下层子节点,参数为空时查询最顶层
     * @return 树结构数据
     */
    @ApiVersion(1)
    @GetMapping("treeData")
    public ActResult treeData(String id) throws ActException {
        try {
            List<PermissionVO> vos = BeanTransform.copyProperties(permissionAPI.treeData(id), PermissionVO.class);
            return ActResult.initialize(vos);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 添加资源
     *
     * @param bo 新的资源信息
     * @return 持久化的的资源信息
     */
    @ApiVersion(1)
    @PostMapping("add")
    public ActResult add(PermissionBO bo) throws ActException {
        try {
            return ActResult.initialize(permissionAPI.saveByBO(bo));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 通过id删除权限资源(如该节点存在子节点,先删除子节点)
     *
     * @param id 权限资源唯一标示
     * @return
     */
    @ApiVersion(1)
    @DeleteMapping("delete/{id}")
    public ActResult delete(@PathVariable String id) throws ActException {
        try {
            permissionAPI.delete(id);
            return new ActResult("delete is success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}