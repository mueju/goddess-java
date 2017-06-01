package com.bjike.goddess.materialsummary.vo;

/**
* 入库来源日汇总表现层对象
* @Author:			[ sunfengtao ]
* @Date:			[  2017-05-22 11:04 ]
* @Description:	[ 入库来源日汇总表现层对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class InStockSoruceDaySumVO { 

/**
* id
*/
 private String  id; 
/**
* 汇总日期
*/
 private LocalDate  sumDate; 

/**
* 入库来源
*/
 private InstockType  instockType; 

/**
* 现入库地区
*/
 private String  curInstockArea; 

/**
* 部门(项目组)
*/
 private String  projectGroup; 

/**
* 总数量
*/
 private Integer  totalQty; 

/**
* 总金额
*/
 private Double  amount; 

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
 public LocalDate getSumDate () { 
 return sumDate;
 } 
 public void setSumDate (LocalDate sumDate ) { 
 this.sumDate = sumDate ; 
 } 
 public InstockType getInstockType () { 
 return instockType;
 } 
 public void setInstockType (InstockType instockType ) { 
 this.instockType = instockType ; 
 } 
 public String getCurInstockArea () { 
 return curInstockArea;
 } 
 public void setCurInstockArea (String curInstockArea ) { 
 this.curInstockArea = curInstockArea ; 
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
 public Double getAmount () { 
 return amount;
 } 
 public void setAmount (Double amount ) { 
 this.amount = amount ; 
 } 
 public Status getStatus () { 
 return status;
 } 
 public void setStatus (Status status ) { 
 this.status = status ; 
 } 
 }