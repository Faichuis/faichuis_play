package com.faichuis.faichuismall.entity;

import com.baomidou.mybatisplus.annotation.TableId;

public class CmsPrefrenceAreaProductRelationDO {

    @TableId
    private Long id;

    private Long prefrenceAreaId;

    private Long productId;
}
