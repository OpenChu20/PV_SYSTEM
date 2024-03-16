package com.ruoyi.solarProject.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 pj_energy_saving
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public class PjEnergySaving extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private String pjNo;

    /** 节省标煤 */
    @Excel(name = "节省标煤")
    private Long coalSavingAverage;

    /** 减排二氧化碳 */
    @Excel(name = "减排二氧化碳")
    private Long carbonSavingAverage;

    /** 减排二氧化硫 */
    @Excel(name = "减排二氧化硫")
    private Long sulfurSavingAverage;

    /** 减排氮氧化物 */
    @Excel(name = "减排氮氧化物")
    private Long nitricSavingAverage;

    /** 减排烟尘 */
    @Excel(name = "减排烟尘")
    private Long smokeSavingAverage;

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

    public void setPjNo(String pjNo)
    {
        this.pjNo = pjNo;
    }

    public String getPjNo()
    {
        return pjNo;
    }
    public void setCoalSavingAverage(Long coalSavingAverage)
    {
        this.coalSavingAverage = coalSavingAverage;
    }

    public Long getCoalSavingAverage()
    {
        return coalSavingAverage;
    }
    public void setCarbonSavingAverage(Long carbonSavingAverage)
    {
        this.carbonSavingAverage = carbonSavingAverage;
    }

    public Long getCarbonSavingAverage()
    {
        return carbonSavingAverage;
    }
    public void setSulfurSavingAverage(Long sulfurSavingAverage)
    {
        this.sulfurSavingAverage = sulfurSavingAverage;
    }

    public Long getSulfurSavingAverage()
    {
        return sulfurSavingAverage;
    }
    public void setNitricSavingAverage(Long nitricSavingAverage)
    {
        this.nitricSavingAverage = nitricSavingAverage;
    }

    public Long getNitricSavingAverage()
    {
        return nitricSavingAverage;
    }
    public void setSmokeSavingAverage(Long smokeSavingAverage)
    {
        this.smokeSavingAverage = smokeSavingAverage;
    }

    public Long getSmokeSavingAverage()
    {
        return smokeSavingAverage;
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
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pjNo", getPjNo())
            .append("coalSavingAverage", getCoalSavingAverage())
            .append("carbonSavingAverage", getCarbonSavingAverage())
            .append("sulfurSavingAverage", getSulfurSavingAverage())
            .append("nitricSavingAverage", getNitricSavingAverage())
            .append("smokeSavingAverage", getSmokeSavingAverage())
            .append("isDelete", getIsDelete())
            .append("createTime", getCreateTime())
            .append("createId", getCreateId())
            .append("updTime", getUpdTime())
            .append("updId", getUpdId())
            .toString();
    }
}
