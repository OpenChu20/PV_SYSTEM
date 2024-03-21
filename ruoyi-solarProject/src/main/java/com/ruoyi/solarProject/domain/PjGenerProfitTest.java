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
 * 年对象 pj_gener_profit_test
 *
 * @author ruoyi
 * @date 2024-03-14
 */
@Data
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal annulGenerate;

    /** 节省电费 */
    @Excel(name = "节省电费")
    @JsonFormat(pattern = "#.##%", shape = JsonFormat.Shape.STRING)
    private BigDecimal saveElecPrice;

    /** 余电上网收益 */
    @Excel(name = "余电上网收益")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal sendStateIncome;

    /** 年净收益 */
    @Excel(name = "年净收益")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal annulIncome;

    /** 年投资回报率 */
    @Excel(name = "年投资回报率")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal incomeRatioAnnul;

    /** 总投资回报率 */
    @Excel(name = "总投资回报率")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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

}
