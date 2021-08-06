package com.joker.product.domain.service;

import java.util.List;

import com.joker.product.domain.domain.CartProductDomain;
import com.joker.product.domain.domain.PmsProductParamDomain;
import com.joker.product.domain.domain.PromotionProductDomain;

/**
 * 库存管理
 * @author joker
 */
public interface StockManageDomainService {
    CartProductDomain getCartProduct(Long id);
    List<PromotionProductDomain> getPromotionProductList(List<Long> ids);

    /**
     * add by yangguo
     * 获取商品详情信息
     * @param id 产品ID
     */
    PmsProductParamDomain getProductInfo(Long id);

    /**
     * 查找出所有的产品ID
     * @return
     */
    List<Long> getAllProductId();
}
