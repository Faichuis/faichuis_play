package com.joker.product.api.common.resp;

import java.math.BigDecimal;

import com.faichuis.faichuismall.model.PmsProduct;

/**
 * 秒杀信息和商品对象封装
 * @author joker
 */
public class FlashPromotionProductResp extends PmsProduct {
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}
