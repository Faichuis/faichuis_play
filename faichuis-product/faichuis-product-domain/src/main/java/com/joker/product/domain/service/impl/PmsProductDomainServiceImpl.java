package com.joker.product.domain.service.impl;

import java.util.List;

import com.joker.product.domain.domain.FlashPromotionParamDomain;
import com.joker.product.domain.domain.FlashPromotionProductDomain;
import com.joker.product.domain.service.PmsProductDomainService;

/**
 * @author joker
 */
public class PmsProductDomainServiceImpl implements PmsProductDomainService {
    @Override
    public List<FlashPromotionProductDomain> getFlashProductList(Long flashPromotionId, Long sessionId) {
        return null;
    }

    @Override
    public List<FlashPromotionProductDomain> getHomePromotionProductList(List<Long> promotionIds) {
        return null;
    }

    @Override
    public FlashPromotionParamDomain getFlashPromotion(Long pid) {
        return null;
    }
}
