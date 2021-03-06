package com.bjike.goddess.enterpriseculturemanage.vo;

/**
 * 企业文化信息表现层对象
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-03-31 05:05 ]
 * @Description: [ 企业文化信息表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class EnterpriseCultureInfoVO {

    /**
     * id
     */
    private String id;
    /**
     * 主题
     */
    private String theme;

    /**
     * 执行阶段
     */
    private String executeStage;

    /**
     * 执行问题
     */
    private String executeQuestion;

    /**
     * 解决方案
     */
    private String solution;

    /**
     * 员工意见
     */
    private String employeeSuggest;

    /**
     * 宣传方案Id
     */
    private String publicizeId;

    /**
     * 刊物方案Id
     */
    private String periodicalId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getExecuteStage() {
        return executeStage;
    }

    public void setExecuteStage(String executeStage) {
        this.executeStage = executeStage;
    }

    public String getExecuteQuestion() {
        return executeQuestion;
    }

    public void setExecuteQuestion(String executeQuestion) {
        this.executeQuestion = executeQuestion;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getEmployeeSuggest() {
        return employeeSuggest;
    }

    public void setEmployeeSuggest(String employeeSuggest) {
        this.employeeSuggest = employeeSuggest;
    }

    public String getPublicizeId() {
        return publicizeId;
    }

    public void setPublicizeId(String publicizeId) {
        this.publicizeId = publicizeId;
    }

    public String getPeriodicalId() {
        return periodicalId;
    }

    public void setPeriodicalId(String periodicalId) {
        this.periodicalId = periodicalId;
    }

}