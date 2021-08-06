package com.faichuis.faichuismall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


import java.util.Date;

@Data
@Accessors(chain = true)
@TableName("cms_member_report")
@EqualsAndHashCode(callSuper = false)
public class CmsMemberReportDO {

    @TableId
    private Long id;

    @ApiModelProperty(value = "举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer reportType;

    @ApiModelProperty(value = "举报人")
    private String reportMemberName;

    private Date createTime;

    private String reportObject;

    @ApiModelProperty(value = "举报状态：0->未处理；1->已处理")
    private Integer reportStatus;

    @ApiModelProperty(value = "处理结果：0->无效；1->有效；2->恶意")
    private Integer handleStatus;

    private String note;
}
