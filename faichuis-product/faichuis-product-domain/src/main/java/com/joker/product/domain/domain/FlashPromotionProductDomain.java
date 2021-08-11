package com.joker.product.domain.domain;

import java.math.BigDecimal;

import com.faichuis.faichuismall.model.PmsProduct;
import lombok.Data;

/**
 * 秒杀信息和商品对象封装
 * @author joker
 */
@Data
public class FlashPromotionProductDomain extends PmsProduct {
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}