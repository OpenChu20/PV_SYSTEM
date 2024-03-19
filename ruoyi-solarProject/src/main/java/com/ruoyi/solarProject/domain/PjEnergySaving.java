package com.ruoyi.solarProject.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * ioo对象 pj_energy_saving
 *
 * @author ruoyi
 * @date 2024-03-19
 */
public class PjEnergySaving extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private String pjNo;

    /** 节省标煤 */
    @Excel(name = "节省标煤")
    private Integer coalSavingAverage;

    /** 减排二氧化碳 */
    @Excel(name = "减排二氧化碳")
    private Integer carbonSavingAverage;

    /** 减排二氧化硫 */
    @Excel(name = "减排二氧化硫")
    private Integer sulfurSavingAverage;

    /** 减排氮氧化物 */
    @Excel(name = "减排氮氧化物")
    private Integer nitricSavingAverage;

    /** 减排烟尘 */
    @Excel(name = "减排烟尘")
    private Integer smokeSavingAverage;

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
    public void setCoalSavingAverage(Integer coalSavingAverage)
    {
        this.coalSavingAverage = coalSavingAverage;
    }

    public Integer getCoalSavingAverage()
    {
        return coalSavingAverage;
    }
    public void setCarbonSavingAverage(Integer carbonSavingAverage)
    {
        this.carbonSavingAverage = carbonSavingAverage;
    }

    public Integer getCarbonSavingAverage()
    {
        return carbonSavingAverage;
    }
    public void setSulfurSavingAverage(Integer sulfurSavingAverage)
    {
        this.sulfurSavingAverage = sulfurSavingAverage;
    }

    public Integer getSulfurSavingAverage()
    {
        return sulfurSavingAverage;
    }
    public void setNitricSavingAverage(Integer nitricSavingAverage)
    {
        this.nitricSavingAverage = nitricSavingAverage;
    }

    public Integer getNitricSavingAverage()
    {
        return nitricSavingAverage;
    }
    public void setSmokeSavingAverage(Integer smokeSavingAverage)
    {
        this.smokeSavingAverage = smokeSavingAverage;
    }

    public Integer getSmokeSavingAverage()
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
