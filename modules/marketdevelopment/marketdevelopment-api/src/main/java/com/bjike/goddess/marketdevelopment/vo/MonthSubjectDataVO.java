package com.bjike.goddess.marketdevelopment.vo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 业务方向科目数据业务传输对象
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-11-30 03:03 ]
 * @Description: [ 业务方向科目数据业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MonthSubjectDataVO extends BaseBO {

    /**
     * 业务方向类型id
     */
    private String businessDataId;

    /**
     * 业务方向科目
     */
    private String subject;

    private MonthSubjectVO monthSubjectBO;


    public String getBusinessDataId() {
        return businessDataId;
    }

    public void setBusinessDataId(String businessDataId) {
        this.businessDataId = businessDataId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MonthSubjectVO getMonthSubjectBO() {
        return monthSubjectBO;
    }

    public void setMonthSubjectBO(MonthSubjectVO monthSubjectBO) {
        this.monthSubjectBO = monthSubjectBO;
    }
}