package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 pj_gener_profit_test
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
public class PjGenerProfitTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private String pjNo;

    /** 测算类型 */
    @Excel(name = "测算类型")
    private String testType;

    /** 首年衰减值 */
    @Excel(name = "首年衰减值")
    private BigDecimal firstDecreaseValue;

    /** 非首年衰减值 */
    @Excel(name = "非首年衰减值")
    private BigDecimal otherDecreaseValue;

    /** PR值 */
    @Excel(name = "PR值")
    private BigDecimal prValue;

    /** 年份 */
    @Excel(name = "年份")
    private String year;

    /** 年度发电量 */
    @Excel(name = "年度发电量")
    private BigDecimal annulGenerate;

    /** 节省电费 */
    @Excel(name = "节省电费")
    private BigDecimal saveElecPrice;

    /** 余电上网收益 */
    @Excel(name = "余电上网收益")
    private BigDecimal sendStateIncome;

    /** 年净收益 */
    @Excel(name = "年净收益")
    private BigDecimal annulIncome;

    /** 年投资回报率 */
    @Excel(name = "年投资回报率")
    private BigDecimal incomeRatioAnnul;

    /** 总投资回报率 */
    @Excel(name = "总投资回报率")
    private BigDecimal incomeRatioTotal;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private String isDelete;

    /** 插入用户 */
    @Excel(name = "插入用户")
    private String createId;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createTime;


    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updTime;

    /** 更新用户 */
    @Excel(name = "更新用户")
    private String updId;


    /** 插入用户 */
    @Excel(name = "插入用户")
    private String annul_generate_c;
    /** 插入用户 */
    @Excel(name = "插入用户")
    private String save_elec_price_c;
    /** 插入用户 */
    @Excel(name = "插入用户")
    private String send_state_income_c;
    /** 插入用户 */
    @Excel(name = "插入用户")
    private String annul_income_c;
    /** 插入用户 */
    @Excel(name = "插入用户")
    private String income_ratio_annul_c;
    /** 插入用户 */
    @Excel(name = "插入用户")
    private String income_ratio_total_c;

    public String getAnnul_generate_c() {
        return annul_generate_c;
    }

    public void setAnnul_generate_c(String annul_generate_c) {
        this.annul_generate_c = annul_generate_c;
    }

    public String getSave_elec_price_c() {
        return save_elec_price_c;
    }

    public void setSave_elec_price_c(String save_elec_price_c) {
        this.save_elec_price_c = save_elec_price_c;
    }

    public String getSend_state_income_c() {
        return send_state_income_c;
    }

    public void setSend_state_income_c(String send_state_income_c) {
        this.send_state_income_c = send_state_income_c;
    }

    public String getAnnul_income_c() {
        return annul_income_c;
    }

    public void setAnnul_income_c(String annul_income_c) {
        this.annul_income_c = annul_income_c;
    }

    public String getIncome_ratio_annul_c() {
        return income_ratio_annul_c;
    }

    public void setIncome_ratio_annul_c(String income_ratio_annul_c) {
        this.income_ratio_annul_c = income_ratio_annul_c;
    }

    public String getIncome_ratio_total_c() {
        return income_ratio_total_c;
    }

    public void setIncome_ratio_total_c(String income_ratio_total_c) {
        this.income_ratio_total_c = income_ratio_total_c;
    }

    public void setPjNo(String pjNo)
    {
        this.pjNo = pjNo;
    }

    public String getPjNo() 
    {
        return pjNo;
    }
    public void setTestType(String testType) 
    {
        this.testType = testType;
    }

    public String getTestType() 
    {
        return testType;
    }
    public void setFirstDecreaseValue(BigDecimal firstDecreaseValue) 
    {
        this.firstDecreaseValue = firstDecreaseValue;
    }

    public BigDecimal getFirstDecreaseValue() 
    {
        return firstDecreaseValue;
    }
    public void setOtherDecreaseValue(BigDecimal otherDecreaseValue) 
    {
        this.otherDecreaseValue = otherDecreaseValue;
    }

    public BigDecimal getOtherDecreaseValue() 
    {
        return otherDecreaseValue;
    }
    public void setPrValue(BigDecimal prValue) 
    {
        this.prValue = prValue;
    }

    public BigDecimal getPrValue() 
    {
        return prValue;
    }
    public void setYear(String year) 
    {
        this.year = year;
    }

    public String getYear() 
    {
        return year;
    }
    public void setAnnulGenerate(BigDecimal annulGenerate) 
    {
        this.annulGenerate = annulGenerate;
    }

    public BigDecimal getAnnulGenerate() 
    {
        return annulGenerate;
    }
    public void setSaveElecPrice(BigDecimal saveElecPrice) 
    {
        this.saveElecPrice = saveElecPrice;
    }

    public BigDecimal getSaveElecPrice() 
    {
        return saveElecPrice;
    }
    public void setSendStateIncome(BigDecimal sendStateIncome) 
    {
        this.sendStateIncome = sendStateIncome;
    }

    public BigDecimal getSendStateIncome() 
    {
        return sendStateIncome;
    }
    public void setAnnulIncome(BigDecimal annulIncome) 
    {
        this.annulIncome = annulIncome;
    }

    public BigDecimal getAnnulIncome() 
    {
        return annulIncome;
    }
    public void setIncomeRatioAnnul(BigDecimal incomeRatioAnnul) 
    {
        this.incomeRatioAnnul = incomeRatioAnnul;
    }

    public BigDecimal getIncomeRatioAnnul() 
    {
        return incomeRatioAnnul;
    }
    public void setIncomeRatioTotal(BigDecimal incomeRatioTotal) 
    {
        this.incomeRatioTotal = incomeRatioTotal;
    }

    public BigDecimal getIncomeRatioTotal() 
    {
        return incomeRatioTotal;
    }
    public void setIsDelete(String isDelete) 
    {
        this.isDelete = isDelete;
    }

    public String getIsDelete() 
    {
        return isDelete;
    }
    public void setCreateId(String createId) 
    {
        this.createId = createId;
    }

    public String getCreateId() 
    {
        return createId;
    }
    public void setUpdTime(Date updTime) 
    {
        this.updTime = updTime;
    }

    public Date getUpdTime() 
    {
        return updTime;
    }
    public void setUpdId(String updId) 
    {
        this.updId = updId;
    }

    public String getUpdId() 
    {
        return updId;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pjNo", getPjNo())
            .append("testType", getTestType())
            .append("firstDecreaseValue", getFirstDecreaseValue())
            .append("otherDecreaseValue", getOtherDecreaseValue())
            .append("prValue", getPrValue())
            .append("year", getYear())
            .append("annulGenerate", getAnnulGenerate())
            .append("saveElecPrice", getSaveElecPrice())
            .append("sendStateIncome", getSendStateIncome())
            .append("annulIncome", getAnnulIncome())
            .append("incomeRatioAnnul", getIncomeRatioAnnul())
            .append("incomeRatioTotal", getIncomeRatioTotal())
            .append("isDelete", getIsDelete())
            .append("createTime", getCreateTime())
            .append("createId", getCreateId())
            .append("updTime", getUpdTime())
            .append("updId", getUpdId())
            .toString();
    }
}
