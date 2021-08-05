package com.faichuis.faichuismall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("cms_help_category")
@EqualsAndHashCode(callSuper = false)
public class CmsHelpCategoryDO {

    @TableId
    private Long id;

    private String name;

    @ApiModelProperty(value = "分类图标")
    private String icon;

    @ApiModelProperty(value = "专题数量")
    private Integer helpCount;

    private Integer showStatus;

    private Integer sort;
}
