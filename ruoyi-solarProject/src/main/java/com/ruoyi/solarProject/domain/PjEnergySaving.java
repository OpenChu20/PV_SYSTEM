package com.ruoyi.solarProject.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
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
@Data
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

}
