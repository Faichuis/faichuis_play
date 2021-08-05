package com.faichuis.faichuismall.entity;

import io.swagger.annotations.ApiModelProperty;

public class CmsSubjectCategoryDO {

    private Long id;

    private String name;

    @ApiModelProperty(value = "分类图标")
    private String icon;

    @ApiModelProperty(value = "专题数量")
    private Integer subjectCount;

    private Integer showStatus;

    private Integer sort;

}
