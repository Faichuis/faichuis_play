package com.joker.product.domain.service.impl;

import java.util.List;

import com.joker.product.domain.domain.CartProductDomain;
import com.joker.product.domain.domain.PmsProductParamDomain;
import com.joker.product.domain.domain.PromotionProductDomain;
import com.joker.product.domain.service.StockManageDomainService;

/**
 * @author joker
 */
public class StockManageDomainServiceImpl implements StockManageDomainService {
    @Override
    public CartProductDomain getCartProduct(Long id) {
        return null;
    }

    @Override
    public List<PromotionProductDomain> getPromotionProductList(List<Long> ids) {
        return null;
    }

    @Override
    public PmsProductParamDomain getProductInfo(Long id) {
        return null;
    }

    @Override
    public List<Long> getAllProductId() {
        return null;
    }
}
