package com.bjike.goddess.materialsummary.vo;

import com.bjike.goddess.common.api.type.Status;

/**
 * 地区部门领用年汇总表现层对象
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-05-22 11:27 ]
 * @Description: [ 地区部门领用年汇总表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class AreaDepartReceiveYearSumVO {

    /**
     * id
     */
    private String id;
    /**
     * 汇总起始时间
     */
    private String sumStartTime;

    /**
     * 汇总结束时间
     */
    private String sumEndTime;

    /**
     * 地区
     */
    private String area;

    /**
     * 部门(项目组)
     */
    private String projectGroup;

    /**
     * 物资用途
     */
    private String materialUse;

    /**
     * 总数量
     */
    private Integer totalQty;

    /**
     * 状态
     */
    private Status status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSumStartTime() {
        return sumStartTime;
    }

    public void setSumStartTime(String sumStartTime) {
        this.sumStartTime = sumStartTime;
    }

    public String getSumEndTime() {
        return sumEndTime;
    }

    public void setSumEndTime(String sumEndTime) {
        this.sumEndTime = sumEndTime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getMaterialUse() {
        return materialUse;
    }

    public void setMaterialUse(String materialUse) {
        this.materialUse = materialUse;
    }

    public Integer getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQty = totalQty;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}