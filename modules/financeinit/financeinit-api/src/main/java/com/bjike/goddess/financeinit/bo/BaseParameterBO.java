package com.bjike.goddess.financeinit.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.financeinit.enums.AccountingPeriod;
import com.bjike.goddess.financeinit.enums.AccountingSystem;
import com.bjike.goddess.financeinit.enums.ScaleShape;

/**
 * 基本参数业务传输对象
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-10-10 04:11 ]
 * @Description: [ 基本参数业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class BaseParameterBO extends BaseBO {

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 本位币
     */
    private String functionalCurrency;

    /**
     * 会计制度
     */
    private AccountingSystem accountingSystem;

    /**
     * 会计期间界定方式
     */
    private String defWayAccountPerod;

    /**
     * 会计年度启用时间
     */
    private String accountingYear;

    /**
     * 账套会计期间启用日期
     */
    private String dateDuringPeriod;

    /**
     * 账套会计启用日期
     */
    private String accountOpening;

    /**
     * 税号
     */
    private String ein;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 开户银行
     */
    private String bank;

    /**
     * 银行账号
     */
    private String account;

    /**
     * 公司规模形式
     */
    private ScaleShape scaleShape;

    /**
     * 备注
     */
    private String remark;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFunctionalCurrency() {
        return functionalCurrency;
    }

    public void setFunctionalCurrency(String functionalCurrency) {
        this.functionalCurrency = functionalCurrency;
    }

    public AccountingSystem getAccountingSystem() {
        return accountingSystem;
    }

    public void setAccountingSystem(AccountingSystem accountingSystem) {
        this.accountingSystem = accountingSystem;
    }

    public String getDefWayAccountPerod() {
        return defWayAccountPerod;
    }

    public void setDefWayAccountPerod(String defWayAccountPerod) {
        this.defWayAccountPerod = defWayAccountPerod;
    }

    public String getAccountingYear() {
        return accountingYear;
    }

    public void setAccountingYear(String accountingYear) {
        this.accountingYear = accountingYear;
    }

    public String getDateDuringPeriod() {
        return dateDuringPeriod;
    }

    public void setDateDuringPeriod(String dateDuringPeriod) {
        this.dateDuringPeriod = dateDuringPeriod;
    }

    public String getAccountOpening() {
        return accountOpening;
    }

    public void setAccountOpening(String accountOpening) {
        this.accountOpening = accountOpening;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ScaleShape getScaleShape() {
        return scaleShape;
    }

    public void setScaleShape(ScaleShape scaleShape) {
        this.scaleShape = scaleShape;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}