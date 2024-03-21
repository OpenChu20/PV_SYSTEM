package com.ruoyi.solarProject.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
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
@Data
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

}
