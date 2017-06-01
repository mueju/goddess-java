package com.bjike.goddess.materialsummary.to;

import com.bjike.goddess.common.api.to.BaseTO;
/**
* 物资状态日汇总
* @Author:			[ sunfengtao ]
* @Date:			[  2017-05-22 11:18 ]
* @Description:	[ 物资状态日汇总 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class MaterialStatusDaySumTO extends BaseTO { 

/**
* 汇总日期
*/
 private LocalDate  sumDate; 

/**
* 物资状态
*/
 private MaterialState  instockState; 

/**
* 物资分类
*/
 private String  deviceType; 

/**
* 地区
*/
 private String  area; 

/**
* 部门(项目组)
*/
 private String  projectGroup; 

/**
* 总数量
*/
 private Integer  totalQty; 

/**
* 状态
*/
 private Status  status; 



 public LocalDate getSumDate () { 
 return sumDate;
 } 
 public void setSumDate (LocalDate sumDate ) { 
 this.sumDate = sumDate ; 
 } 
 public MaterialState getInstockState () { 
 return instockState;
 } 
 public void setInstockState (MaterialState instockState ) { 
 this.instockState = instockState ; 
 } 
 public String getDeviceType () { 
 return deviceType;
 } 
 public void setDeviceType (String deviceType ) { 
 this.deviceType = deviceType ; 
 } 
 public String getArea () { 
 return area;
 } 
 public void setArea (String area ) { 
 this.area = area ; 
 } 
 public String getProjectGroup () { 
 return projectGroup;
 } 
 public void setProjectGroup (String projectGroup ) { 
 this.projectGroup = projectGroup ; 
 } 
 public Integer getTotalQty () { 
 return totalQty;
 } 
 public void setTotalQty (Integer totalQty ) { 
 this.totalQty = totalQty ; 
 } 
 public Status getStatus () { 
 return status;
 } 
 public void setStatus (Status status ) { 
 this.status = status ; 
 } 
 }