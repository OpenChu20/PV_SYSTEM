package com.ruoyi.solarProject.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 pj_gener_profit_gather
 *
 * @author ruoyi
 * @date 2024-03-17
 */
@Data
public class PjGenerProfitGather extends BaseEntity
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

}
