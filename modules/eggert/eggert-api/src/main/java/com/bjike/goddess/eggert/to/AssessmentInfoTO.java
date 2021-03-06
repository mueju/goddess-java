package com.bjike.goddess.eggert.to;

import com.bjike.goddess.common.api.to.BaseTO;

/**
 * 评估信息
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-02 02:19 ]
 * @Description: [ 评估信息 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class AssessmentInfoTO extends BaseTO {

    /**
     * 调研目的
     */
    private String purpose;

    /**
     * 调研对象
     */
    private String object;

    /**
     * 调研内容
     */
    private String content;

    /**
     * 调研内容明细
     */
    private String contentSubsidiary;

    /**
     * 调研工具
     */
    private String tool;

    /**
     * 答题时间
     */
    private String answerTime;

    /**
     * 未评估
     */
    private String noAssessment;

    /**
     * 已接受评估
     */
    private String hasBeenEvaluated;

    /**
     * 通过评估
     */
    private String byEvaluating;

    /**
     * 计分项总分
     */
    private String scoringTotalScore;

    /**
     * 答案
     */
    private String answer;

    /**
     * 意见
     */
    private String opinion;


    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentSubsidiary() {
        return contentSubsidiary;
    }

    public void setContentSubsidiary(String contentSubsidiary) {
        this.contentSubsidiary = contentSubsidiary;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    public String getNoAssessment() {
        return noAssessment;
    }

    public void setNoAssessment(String noAssessment) {
        this.noAssessment = noAssessment;
    }

    public String getHasBeenEvaluated() {
        return hasBeenEvaluated;
    }

    public void setHasBeenEvaluated(String hasBeenEvaluated) {
        this.hasBeenEvaluated = hasBeenEvaluated;
    }

    public String getByEvaluating() {
        return byEvaluating;
    }

    public void setByEvaluating(String byEvaluating) {
        this.byEvaluating = byEvaluating;
    }

    public String getScoringTotalScore() {
        return scoringTotalScore;
    }

    public void setScoringTotalScore(String scoringTotalScore) {
        this.scoringTotalScore = scoringTotalScore;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}