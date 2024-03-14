package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 年对象 pj_gener_profit_test
 *
 * @author ruoyi
 * @date 2024-03-14
 */
public class PjGenerProfitTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 项目编号 */
    @Excel(name = "项目编号")
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

    /** 年度发电量（修正） */
    @Excel(name = "年度发电量", readConverterExp = "修=正")
    private BigDecimal annulGenerateC;

    /** 节省电费（修正） */
    @Excel(name = "节省电费", readConverterExp = "修=正")
    private BigDecimal saveElecPriceC;

    /** 余电上网收益（修正） */
    @Excel(name = "余电上网收益", readConverterExp = "修=正")
    private BigDecimal sendStateIncomeC;

    /** 年净收益（修正） */
    @Excel(name = "年净收益", readConverterExp = "修=正")
    private BigDecimal annulIncomeC;

    /** 年投资回报率（修正） */
    @Excel(name = "年投资回报率", readConverterExp = "修=正")
    private BigDecimal incomeRatioAnnulC;

    /** 总投资回报率（修正） */
    @Excel(name = "总投资回报率", readConverterExp = "修=正")
    private BigDecimal incomeRatioTotalC;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private String isDelete;

    /** 插入用户 */
    @Excel(name = "插入用户")
    private String createId;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updTime;

    /** 更新用户 */
    @Excel(name = "更新用户")
    private String updId;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setPjNo(String pjNo)
    {
        this.pjNo = pjNo;
    }

    public String getPjNo()
    {
        return pjNo;
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
    public void setAnnulGenerateC(BigDecimal annulGenerateC)
    {
        this.annulGenerateC = annulGenerateC;
    }

    public BigDecimal getAnnulGenerateC()
    {
        return annulGenerateC;
    }
    public void setSaveElecPriceC(BigDecimal saveElecPriceC)
    {
        this.saveElecPriceC = saveElecPriceC;
    }

    public BigDecimal getSaveElecPriceC()
    {
        return saveElecPriceC;
    }
    public void setSendStateIncomeC(BigDecimal sendStateIncomeC)
    {
        this.sendStateIncomeC = sendStateIncomeC;
    }

    public BigDecimal getSendStateIncomeC()
    {
        return sendStateIncomeC;
    }
    public void setAnnulIncomeC(BigDecimal annulIncomeC)
    {
        this.annulIncomeC = annulIncomeC;
    }

    public BigDecimal getAnnulIncomeC()
    {
        return annulIncomeC;
    }
    public void setIncomeRatioAnnulC(BigDecimal incomeRatioAnnulC)
    {
        this.incomeRatioAnnulC = incomeRatioAnnulC;
    }

    public BigDecimal getIncomeRatioAnnulC()
    {
        return incomeRatioAnnulC;
    }
    public void setIncomeRatioTotalC(BigDecimal incomeRatioTotalC)
    {
        this.incomeRatioTotalC = incomeRatioTotalC;
    }

    public BigDecimal getIncomeRatioTotalC()
    {
        return incomeRatioTotalC;
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

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pjNo", getPjNo())
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
            .append("annulGenerateC", getAnnulGenerateC())
            .append("saveElecPriceC", getSaveElecPriceC())
            .append("sendStateIncomeC", getSendStateIncomeC())
            .append("annulIncomeC", getAnnulIncomeC())
            .append("incomeRatioAnnulC", getIncomeRatioAnnulC())
            .append("incomeRatioTotalC", getIncomeRatioTotalC())
            .append("isDelete", getIsDelete())
            .append("createTime", getCreateTime())
            .append("createId", getCreateId())
            .append("updTime", getUpdTime())
            .append("updId", getUpdId())
            .toString();
    }
}
