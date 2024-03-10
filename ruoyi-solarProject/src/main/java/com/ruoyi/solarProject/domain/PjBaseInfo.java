package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 pj_base_info
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
public class PjBaseInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目编号 */
    private String pjNo;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String pjName;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private String cusNo;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String cusName;

    /** 组件数量 */
    @Excel(name = "组件数量")
    private Long modulesNum;

    /** 单块组件功率 */
    @Excel(name = "单块组件功率")
    private Long perModulesRate;

    /** 总装机量 */
    @Excel(name = "总装机量")
    private BigDecimal totalCapacity;

    /** 系统单价 */
    @Excel(name = "系统单价")
    private BigDecimal pjPerPrice;

    /** 系统总价 */
    @Excel(name = "系统总价")
    private BigDecimal pjTotalPrice;

    /** 单位发电量 */
    @Excel(name = "单位发电量")
    private Long perPvGenr;

    /** 屋顶面积 */
    @Excel(name = "屋顶面积")
    private BigDecimal roofArea;

    /** 光伏面积 */
    @Excel(name = "光伏面积")
    private BigDecimal pvArea;

    /** 屋顶结构材料 */
    @Excel(name = "屋顶结构材料")
    private String roofMaterials;

    /** 安装方式 */
    @Excel(name = "安装方式")
    private String installStyle;

    /** 并网方式 */
    @Excel(name = "并网方式")
    private String connectGridStyle;

    /** 防水方式 */
    @Excel(name = "防水方式")
    private String waterProofStyle;

    /** 功能属性 */
    @Excel(name = "功能属性")
    private String funcProperty;

    /** 电压等级 */
    @Excel(name = "电压等级")
    private BigDecimal voltgeLevel;

    /** 变压器容量 */
    @Excel(name = "变压器容量")
    private BigDecimal trancformerCapacity;

    /** 客户国网电价 */
    @Excel(name = "客户国网电价")
    private BigDecimal electPrice;

    /** 余电上网电价 */
    @Excel(name = "余电上网电价")
    private BigDecimal sendStatePrice;

    /** 自发自用占比 */
    @Excel(name = "自发自用占比")
    private BigDecimal selfUsePart;

    /** 余电上网占比 */
    @Excel(name = "余电上网占比")
    private BigDecimal sendStatePart;

    /** 客户年用电量 */
    @Excel(name = "客户年用电量")
    private BigDecimal selfUseAmount;

    /** 补贴总金额 */
    @Excel(name = "补贴总金额")
    private BigDecimal pjTotalBonus;

    /** 项目备注 */
    @Excel(name = "项目备注")
    private String otherDesc;

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
    public void setPjName(String pjName) 
    {
        this.pjName = pjName;
    }

    public String getPjName() 
    {
        return pjName;
    }
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
    public void setModulesNum(Long modulesNum) 
    {
        this.modulesNum = modulesNum;
    }

    public Long getModulesNum() 
    {
        return modulesNum;
    }
    public void setPerModulesRate(Long perModulesRate) 
    {
        this.perModulesRate = perModulesRate;
    }

    public Long getPerModulesRate() 
    {
        return perModulesRate;
    }
    public void setTotalCapacity(BigDecimal totalCapacity) 
    {
        this.totalCapacity = totalCapacity;
    }

    public BigDecimal getTotalCapacity() 
    {
        return totalCapacity;
    }
    public void setPjPerPrice(BigDecimal pjPerPrice) 
    {
        this.pjPerPrice = pjPerPrice;
    }

    public BigDecimal getPjPerPrice() 
    {
        return pjPerPrice;
    }
    public void setPjTotalPrice(BigDecimal pjTotalPrice) 
    {
        this.pjTotalPrice = pjTotalPrice;
    }

    public BigDecimal getPjTotalPrice() 
    {
        return pjTotalPrice;
    }
    public void setPerPvGenr(Long perPvGenr) 
    {
        this.perPvGenr = perPvGenr;
    }

    public Long getPerPvGenr() 
    {
        return perPvGenr;
    }
    public void setRoofArea(BigDecimal roofArea) 
    {
        this.roofArea = roofArea;
    }

    public BigDecimal getRoofArea() 
    {
        return roofArea;
    }
    public void setPvArea(BigDecimal pvArea) 
    {
        this.pvArea = pvArea;
    }

    public BigDecimal getPvArea() 
    {
        return pvArea;
    }
    public void setRoofMaterials(String roofMaterials) 
    {
        this.roofMaterials = roofMaterials;
    }

    public String getRoofMaterials() 
    {
        return roofMaterials;
    }
    public void setInstallStyle(String installStyle) 
    {
        this.installStyle = installStyle;
    }

    public String getInstallStyle() 
    {
        return installStyle;
    }
    public void setConnectGridStyle(String connectGridStyle) 
    {
        this.connectGridStyle = connectGridStyle;
    }

    public String getConnectGridStyle() 
    {
        return connectGridStyle;
    }
    public void setWaterProofStyle(String waterProofStyle) 
    {
        this.waterProofStyle = waterProofStyle;
    }

    public String getWaterProofStyle() 
    {
        return waterProofStyle;
    }
    public void setFuncProperty(String funcProperty) 
    {
        this.funcProperty = funcProperty;
    }

    public String getFuncProperty() 
    {
        return funcProperty;
    }
    public void setVoltgeLevel(BigDecimal voltgeLevel) 
    {
        this.voltgeLevel = voltgeLevel;
    }

    public BigDecimal getVoltgeLevel() 
    {
        return voltgeLevel;
    }
    public void setTrancformerCapacity(BigDecimal trancformerCapacity) 
    {
        this.trancformerCapacity = trancformerCapacity;
    }

    public BigDecimal getTrancformerCapacity() 
    {
        return trancformerCapacity;
    }
    public void setElectPrice(BigDecimal electPrice) 
    {
        this.electPrice = electPrice;
    }

    public BigDecimal getElectPrice() 
    {
        return electPrice;
    }
    public void setSendStatePrice(BigDecimal sendStatePrice) 
    {
        this.sendStatePrice = sendStatePrice;
    }

    public BigDecimal getSendStatePrice() 
    {
        return sendStatePrice;
    }
    public void setSelfUsePart(BigDecimal selfUsePart) 
    {
        this.selfUsePart = selfUsePart;
    }

    public BigDecimal getSelfUsePart() 
    {
        return selfUsePart;
    }
    public void setSendStatePart(BigDecimal sendStatePart) 
    {
        this.sendStatePart = sendStatePart;
    }

    public BigDecimal getSendStatePart() 
    {
        return sendStatePart;
    }
    public void setSelfUseAmount(BigDecimal selfUseAmount) 
    {
        this.selfUseAmount = selfUseAmount;
    }

    public BigDecimal getSelfUseAmount() 
    {
        return selfUseAmount;
    }
    public void setPjTotalBonus(BigDecimal pjTotalBonus) 
    {
        this.pjTotalBonus = pjTotalBonus;
    }

    public BigDecimal getPjTotalBonus() 
    {
        return pjTotalBonus;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pjNo", getPjNo())
            .append("pjName", getPjName())
            .append("cusNo", getCusNo())
            .append("cusName", getCusName())
            .append("modulesNum", getModulesNum())
            .append("perModulesRate", getPerModulesRate())
            .append("totalCapacity", getTotalCapacity())
            .append("pjPerPrice", getPjPerPrice())
            .append("pjTotalPrice", getPjTotalPrice())
            .append("perPvGenr", getPerPvGenr())
            .append("roofArea", getRoofArea())
            .append("pvArea", getPvArea())
            .append("roofMaterials", getRoofMaterials())
            .append("installStyle", getInstallStyle())
            .append("connectGridStyle", getConnectGridStyle())
            .append("waterProofStyle", getWaterProofStyle())
            .append("funcProperty", getFuncProperty())
            .append("voltgeLevel", getVoltgeLevel())
            .append("trancformerCapacity", getTrancformerCapacity())
            .append("electPrice", getElectPrice())
            .append("sendStatePrice", getSendStatePrice())
            .append("selfUsePart", getSelfUsePart())
            .append("sendStatePart", getSendStatePart())
            .append("selfUseAmount", getSelfUseAmount())
            .append("pjTotalBonus", getPjTotalBonus())
            .append("otherDesc", getOtherDesc())
            .append("isDelete", getIsDelete())
            .append("createTime", getCreateTime())
            .append("createId", getCreateId())
            .append("updTime", getUpdTime())
            .append("updId", getUpdId())
            .toString();
    }
}
