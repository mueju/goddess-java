package com.bjike.goddess.businessinteraction.service;

import com.bjike.goddess.businessinteraction.bo.InteractionRelationBO;
import com.bjike.goddess.businessinteraction.to.GuidePermissionTO;
import com.bjike.goddess.businessinteraction.to.InteractionRelationTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.businessinteraction.entity.InteractionRelation;
import com.bjike.goddess.businessinteraction.dto.InteractionRelationDTO;

import java.util.List;

/**
 * 商业能力互动联系业务接口
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-28 03:06 ]
 * @Description: [ 商业能力互动联系业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface InteractionRelationSer extends Ser<InteractionRelation, InteractionRelationDTO> {

    /**
     * 商业能力互动联系列表总条数
     *
     */
    default Long countInter(InteractionRelationDTO interactionRelationDTO) throws SerException {
        return null;
    }
    /**
     * 互动联系列表id
     * @return class InteractionRelationBO
     */
    default InteractionRelationBO getOneById (String id) throws SerException {return null;}


    /**
     * 互动联系列表
     *
     * @return class InteractionRelationBO
     */
    default List<InteractionRelationBO> listInteractionRelation(InteractionRelationDTO interactionRelationDTO) throws SerException {
        return null;
    }

    /**
     * 添加
     *
     * @param interactionRelationTO 互动联系信息
     * @return class InteractionRelationBO
     */
    default InteractionRelationBO addInteractionRelation(InteractionRelationTO interactionRelationTO) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param interactionRelationTO 互动联系信息
     * @return class InteractionRelationBO
     */
    default InteractionRelationBO editInteractionRelation(InteractionRelationTO interactionRelationTO) throws SerException {
        return null;
    }

    /**
     * 删除互动联系信息
     *
     * @param id id
     */
    default void deleteInteractionRelation(String id) throws SerException {
        return;
    }

    ;

    /**
     * 搜索互动联系
     * @return class InteractionRelationBO
     */
    default List<InteractionRelationBO> searchInteractionRelation(InteractionRelationDTO interactionRelationDTO) throws SerException {return null;}

    /**
     * 下拉导航权限
     */
    default Boolean sonPermission() throws SerException {
        return null;
    }
    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }
}