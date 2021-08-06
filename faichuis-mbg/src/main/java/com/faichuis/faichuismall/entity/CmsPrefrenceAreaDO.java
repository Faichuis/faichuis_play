package com.faichuis.faichuismall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("cms_prefrence_area")
@EqualsAndHashCode(callSuper = false)
public class CmsPrefrenceAreaDO {


    @TableId
    private Long id;

    private String name;

    private String subTitle;

    private Integer sort;

    private Integer showStatus;

    @ApiModelProperty(value = "展示图片")
    private byte[] pic;
}
