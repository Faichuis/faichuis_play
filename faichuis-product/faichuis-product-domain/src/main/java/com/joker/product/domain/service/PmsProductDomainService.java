package com.joker.product.domain.service;

import java.util.List;

import com.joker.product.domain.domain.FlashPromotionParamDomain;
import com.joker.product.domain.domain.FlashPromotionProductDomain;

/**
 * @author joker
 */
public interface PmsProductDomainService {
    /**
     * 获取秒杀商品
     * @param flashPromotionId 秒杀活动ID，关联秒杀活动设置
     * @param sessionId 场次活动ID，for example：13:00-14:00场等
     */
    List<FlashPromotionProductDomain> getFlashProductList(Long flashPromotionId, Long sessionId);


    List<FlashPromotionProductDomain> getHomePromotionProductList(List<Long> promotionIds);

    /**
     * 查找所有的秒杀活动商品
     * @return
     */
    FlashPromotionParamDomain getFlashPromotion(Long pid);
}
