package com.bjike.goddess.bidding.api;

import com.bjike.goddess.bidding.bo.BiddingWebInfoBO;
import com.bjike.goddess.bidding.dto.BiddingWebInfoDTO;
import com.bjike.goddess.bidding.entity.BiddingWebInfo;
import com.bjike.goddess.bidding.to.BiddingWebInfoTO;
import com.bjike.goddess.common.api.exception.SerException;

import java.util.List;

/**
 * 招投标网站信息业务接口
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-16T10:15:43.321 ]
 * @Description: [ 招投标网站信息业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface BiddingWebInfoAPI {
    /**
     * 获取所有招投标网站信息
     *
     * @param biddingWebInfoDTO 招投标网站信息dto
     * @return class biddingWebInfoBO
     * @throws SerException
     */
    default List<BiddingWebInfoBO> findListBiddingWebInfo(BiddingWebInfoDTO biddingWebInfoDTO) throws SerException {
        return null;
    }

    /**
     * 添加招投标网站信息
     *
     * @param biddingWebInfoTO 招投标网站信息数据to
     * @throws SerException
     */
    default BiddingWebInfoBO insertBiddingWebInfo(BiddingWebInfoTO biddingWebInfoTO) throws SerException {
        return null;
    }

    /**
     * 编辑招投标网站信息
     *
     * @param biddingWebInfoTO 招投标网站信息数据to
     * @return class biddingWebInfoBO
     * @throws SerException
     */
    default BiddingWebInfoBO editBiddingWebInfo(BiddingWebInfoTO biddingWebInfoTO) throws SerException {
        return null;
    }

    /**
     * 根据id删除招投标网站信息
     *
     * @param id
     * @throws SerException
     */
    default void removeBiddingWebInfo(String id) throws SerException {

    }

}