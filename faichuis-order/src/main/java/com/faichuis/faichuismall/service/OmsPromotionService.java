package com.faichuis.faichuismall.service;

import com.faichuis.faichuismall.domain.CartPromotionItem;
import com.faichuis.faichuismall.model.OmsCartItem;

import java.util.List;

/**
 * Created by macro on 2018/8/27.
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
