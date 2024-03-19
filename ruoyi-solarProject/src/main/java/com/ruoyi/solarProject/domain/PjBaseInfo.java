package com.ruoyi.solarProject.domain;

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
    private Integer modulesNum;

    /** 单块组件功率 */
    @Excel(name = "单块组件功率")
    private Integer perModulesRate;

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
    private Integer perPvGenr;

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
    private String voltgeLevel;

    /** 变压器容量 */
    @Excel(name = "变压器容量")
    private BigDecimal transformerCapacity;

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

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Integer getModulesNum() {
        return modulesNum;
    }

    public void setModulesNum(Integer modulesNum) {
        this.modulesNum = modulesNum;
    }

    public Integer getPerModulesRate() {
        return perModulesRate;
    }

    public void setPerModulesRate(Integer perModulesRate) {
        this.perModulesRate = perModulesRate;
    }

    public BigDecimal getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(BigDecimal totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public BigDecimal getPjPerPrice() {
        return pjPerPrice;
    }

    public void setPjPerPrice(BigDecimal pjPerPrice) {
        this.pjPerPrice = pjPerPrice;
    }

    public BigDecimal getPjTotalPrice() {
        return pjTotalPrice;
    }

    public void setPjTotalPrice(BigDecimal pjTotalPrice) {
        this.pjTotalPrice = pjTotalPrice;
    }

    public Integer getPerPvGenr() {
        return perPvGenr;
    }

    public void setPerPvGenr(Integer perPvGenr) {
        this.perPvGenr = perPvGenr;
    }

    public BigDecimal getRoofArea() {
        return roofArea;
    }

    public void setRoofArea(BigDecimal roofArea) {
        this.roofArea = roofArea;
    }

    public BigDecimal getPvArea() {
        return pvArea;
    }

    public void setPvArea(BigDecimal pvArea) {
        this.pvArea = pvArea;
    }

    public String getRoofMaterials() {
        return roofMaterials;
    }

    public void setRoofMaterials(String roofMaterials) {
        this.roofMaterials = roofMaterials;
    }

    public String getInstallStyle() {
        return installStyle;
    }

    public void setInstallStyle(String installStyle) {
        this.installStyle = installStyle;
    }

    public String getConnectGridStyle() {
        return connectGridStyle;
    }

    public void setConnectGridStyle(String connectGridStyle) {
        this.connectGridStyle = connectGridStyle;
    }

    public String getWaterProofStyle() {
        return waterProofStyle;
    }

    public void setWaterProofStyle(String waterProofStyle) {
        this.waterProofStyle = waterProofStyle;
    }

    public String getFuncProperty() {
        return funcProperty;
    }

    public void setFuncProperty(String funcProperty) {
        this.funcProperty = funcProperty;
    }

    public String getCusNo() {
        return cusNo;
    }

    public String getVoltgeLevel() {
        return voltgeLevel;
    }

    public void setVoltgeLevel(String voltgeLevel) {
        this.voltgeLevel = voltgeLevel;
    }

    public BigDecimal getTrancformerCapacity() {
        return transformerCapacity;
    }

    public void setTrancformerCapacity(BigDecimal trancformerCapacity) {
        this.transformerCapacity = trancformerCapacity;
    }

    public BigDecimal getElectPrice() {
        return electPrice;
    }

    public void setElectPrice(BigDecimal electPrice) {
        this.electPrice = electPrice;
    }

    public BigDecimal getSendStatePrice() {
        return sendStatePrice;
    }

    public void setSendStatePrice(BigDecimal sendStatePrice) {
        this.sendStatePrice = sendStatePrice;
    }

    public BigDecimal getSelfUsePart() {
        return selfUsePart;
    }

    public void setSelfUsePart(BigDecimal selfUsePart) {
        this.selfUsePart = selfUsePart;
    }

    public BigDecimal getSendStatePart() {
        return sendStatePart;
    }

    public void setSendStatePart(BigDecimal sendStatePart) {
        this.sendStatePart = sendStatePart;
    }

    public BigDecimal getSelfUseAmount() {
        return selfUseAmount;
    }

    public void setSelfUseAmount(BigDecimal selfUseAmount) {
        this.selfUseAmount = selfUseAmount;
    }

    public BigDecimal getPjTotalBonus() {
        return pjTotalBonus;
    }

    public void setPjTotalBonus(BigDecimal pjTotalBonus) {
        this.pjTotalBonus = pjTotalBonus;
    }

    public String getOtherDesc() {
        return otherDesc;
    }

    public void setOtherDesc(String otherDesc) {
        this.otherDesc = otherDesc;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public String getUpdId() {
        return updId;
    }

    public void setUpdId(String updId) {
        this.updId = updId;
    }
}
