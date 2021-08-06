package com.joker.product.dto.entity;

import java.math.BigDecimal;

import com.faichuis.faichuismall.model.PmsProduct;
import lombok.Data;

/**
 * 秒杀信息和商品对象封装
 * @author joker
 */
@Data
public class FlashPromotionProductDO extends PmsProduct {
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}