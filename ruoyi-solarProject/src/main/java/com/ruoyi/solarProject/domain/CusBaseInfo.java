package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 cus_base_info
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public class CusBaseInfo
{
    private static final long serialVersionUID = 1L;

    /** 客户编号 */
    private String cusNo;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String cusName;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String otherDesc;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private String isDelete;
    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createTime;
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

    public void setCusNo(String cusNo)
    {
        this.cusNo = cusNo;
    }

    public String getCusNo()
    {
        return cusNo;
    }
    public void setCusName(String cusName)
    {
        this.cusName = cusName;
    }

    public String getCusName()
    {
        return cusName;
    }
    public void setOtherDesc(String otherDesc)
    {
        this.otherDesc = otherDesc;
    }

    public String getOtherDesc()
    {
        return otherDesc;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cusNo", getCusNo())
            .append("cusName", getCusName())
            .append("otherDesc", getOtherDesc())
            .append("isDelete", getIsDelete())
            .append("createId", getCreateId())
            .append("updTime", getUpdTime())
            .append("updId", getUpdId())
            .toString();
    }

}
