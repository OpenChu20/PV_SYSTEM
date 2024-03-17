package com.ruoyi.solarProject.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 【请填写功能名称】对象 pj_gener_profit_gather
 *
 * @author ruoyi
 * @date 2024-03-17
 */
public class ProfitGatherVo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private String pjNo;

    /** 总发电量 */
    @Excel(name = "总发电量")
    private BigDecimal totalGenerate;

    /** 年均发电量 */
    @Excel(name = "年均发电量")
    private BigDecimal avgGenerate;

    /** 节省电费汇总 */
    @Excel(name = "节省电费汇总")
    private BigDecimal sumSavePrice;

    /** 余电上网收益汇总 */
    @Excel(name = "余电上网收益汇总")
    private BigDecimal sumSendStateIncome;

    /** 总发电收益 */
    @Excel(name = "总发电收益")
    private BigDecimal sumAnnulIncome;

    /** 年均收益率 */
    @Excel(name = "年均收益率")
    private BigDecimal avgIncomeRatioAnnul;

    /** 年投资回报率汇总 */
    @Excel(name = "年投资回报率汇总")
    private BigDecimal sumIncomeRatioAnnul;

    /** 年均总回报率 */
    @Excel(name = "年均总回报率")
    private BigDecimal avgIncomeRatioTotal;

    /** 总投资回报率汇总 */
    @Excel(name = "总投资回报率汇总")
    private BigDecimal sumIncomeRatioTotal;

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

    private BigDecimal pjTotalPrice;

    public void setPjNo(String pjNo)
    {
        this.pjNo = pjNo;
    }

    public String getPjNo()
    {
        return pjNo;
    }
    public void setTotalGenerate(BigDecimal totalGenerate)
    {
        this.totalGenerate = totalGenerate;
    }

    public BigDecimal getTotalGenerate()
    {
        return totalGenerate;
    }
    public void setAvgGenerate(BigDecimal avgGenerate)
    {
        this.avgGenerate = avgGenerate;
    }

    public BigDecimal getAvgGenerate()
    {
        return avgGenerate;
    }
    public void setSumSavePrice(BigDecimal sumSavePrice)
    {
        this.sumSavePrice = sumSavePrice;
    }

    public BigDecimal getSumSavePrice()
    {
        return sumSavePrice;
    }
    public void setSumSendStateIncome(BigDecimal sumSendStateIncome)
    {
        this.sumSendStateIncome = sumSendStateIncome;
    }

    public BigDecimal getSumSendStateIncome()
    {
        return sumSendStateIncome;
    }
    public void setSumAnnulIncome(BigDecimal sumAnnulIncome)
    {
        this.sumAnnulIncome = sumAnnulIncome;
    }

    public BigDecimal getSumAnnulIncome()
    {
        return sumAnnulIncome;
    }
    public void setAvgIncomeRatioAnnul(BigDecimal avgIncomeRatioAnnul)
    {
        this.avgIncomeRatioAnnul = avgIncomeRatioAnnul;
    }

    public BigDecimal getAvgIncomeRatioAnnul()
    {
        return avgIncomeRatioAnnul;
    }
    public void setSumIncomeRatioAnnul(BigDecimal sumIncomeRatioAnnul)
    {
        this.sumIncomeRatioAnnul = sumIncomeRatioAnnul;
    }

    public BigDecimal getSumIncomeRatioAnnul()
    {
        return sumIncomeRatioAnnul;
    }
    public void setAvgIncomeRatioTotal(BigDecimal avgIncomeRatioTotal)
    {
        this.avgIncomeRatioTotal = avgIncomeRatioTotal;
    }

    public BigDecimal getAvgIncomeRatioTotal()
    {
        return avgIncomeRatioTotal;
    }
    public void setSumIncomeRatioTotal(BigDecimal sumIncomeRatioTotal)
    {
        this.sumIncomeRatioTotal = sumIncomeRatioTotal;
    }

    public BigDecimal getSumIncomeRatioTotal()
    {
        return sumIncomeRatioTotal;
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

    public BigDecimal getPjTotalPrice() {
        return pjTotalPrice;
    }

    public void setPjTotalPrice(BigDecimal pjTotalPrice) {
        this.pjTotalPrice = pjTotalPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pjNo", getPjNo())
            .append("totalGenerate", getTotalGenerate())
            .append("avgGenerate", getAvgGenerate())
            .append("sumSavePrice", getSumSavePrice())
            .append("sumSendStateIncome", getSumSendStateIncome())
            .append("sumAnnulIncome", getSumAnnulIncome())
            .append("avgIncomeRatioAnnul", getAvgIncomeRatioAnnul())
            .append("sumIncomeRatioAnnul", getSumIncomeRatioAnnul())
            .append("avgIncomeRatioTotal", getAvgIncomeRatioTotal())
            .append("sumIncomeRatioTotal", getSumIncomeRatioTotal())
            .append("isDelete", getIsDelete())
            .append("createTime", getCreateTime())
            .append("createId", getCreateId())
            .append("updTime", getUpdTime())
            .append("updId", getUpdId())
            .toString();
    }
}
