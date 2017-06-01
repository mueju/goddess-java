package com.bjike.goddess.materialsummary.vo;

/**
* 调动经手人月汇总表现层对象
* @Author:			[ sunfengtao ]
* @Date:			[  2017-05-22 11:55 ]
* @Description:	[ 调动经手人月汇总表现层对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class TransferHandlerMonthSumVO { 

/**
* id
*/
 private String  id; 
/**
* 汇总起始时间
*/
 private LocalDateTime  sumStartTime; 

/**
* 汇总结束时间
*/
 private LocalDateTime  sumEndTime; 

/**
* 经手人
*/
 private String  handler; 

/**
* 物资类型
*/
 private String  deviceType; 

/**
* 物资名称
*/
 private String  materialName; 

/**
* 型号
*/
 private String  model; 

/**
* 调入地区总数量
*/
 private Integer  transferredAreaTotalQty; 

/**
* 状态
*/
 private Status  status; 



 public String getId () { 
 return id;
 } 
 public void setId (String id ) { 
 this.id = id ; 
 } 
 public LocalDateTime getSumStartTime () { 
 return sumStartTime;
 } 
 public void setSumStartTime (LocalDateTime sumStartTime ) { 
 this.sumStartTime = sumStartTime ; 
 } 
 public LocalDateTime getSumEndTime () { 
 return sumEndTime;
 } 
 public void setSumEndTime (LocalDateTime sumEndTime ) { 
 this.sumEndTime = sumEndTime ; 
 } 
 public String getHandler () { 
 return handler;
 } 
 public void setHandler (String handler ) { 
 this.handler = handler ; 
 } 
 public String getDeviceType () { 
 return deviceType;
 } 
 public void setDeviceType (String deviceType ) { 
 this.deviceType = deviceType ; 
 } 
 public String getMaterialName () { 
 return materialName;
 } 
 public void setMaterialName (String materialName ) { 
 this.materialName = materialName ; 
 } 
 public String getModel () { 
 return model;
 } 
 public void setModel (String model ) { 
 this.model = model ; 
 } 
 public Integer getTransferredAreaTotalQty () { 
 return transferredAreaTotalQty;
 } 
 public void setTransferredAreaTotalQty (Integer transferredAreaTotalQty ) { 
 this.transferredAreaTotalQty = transferredAreaTotalQty ; 
 } 
 public Status getStatus () { 
 return status;
 } 
 public void setStatus (Status status ) { 
 this.status = status ; 
 } 
 }