package com.joker.product.api.service.product;


import java.util.List;

import com.joker.product.api.common.resp.CartProductResp;
import com.joker.product.api.common.resp.FlashPromotionProductResp;
import com.joker.product.api.common.resp.FlashPromotionSessionExtResp;
import com.joker.product.api.common.resp.PmsProductServiceResp;
import com.joker.product.api.common.resp.PromotionProductResp;


/**
 * @author joker
 */
public interface PmsProductService {
    /**
     * add by yangguo
     * 获取商品详情信息
     * @param id 产品ID
     */
    PmsProductServiceResp getProductInfo(Long id);

    /**
     * 获取秒杀商品
     * @param pageSize 页大小
     * @param pageNum 页号
     * @param flashPromotionId 秒杀活动ID，关联秒杀活动设置
     * @param sessionId 场次活动ID，for example：13:00-14:00场等
     */
    List<FlashPromotionProductResp> getFlashProductList(Integer pageSize, Integer pageNum, Long flashPromotionId,
        Long sessionId);

    /**
     * 获取当前日期秒杀活动所有场次for example：13:00-14:00场等
     */
    List<FlashPromotionSessionExtResp> getFlashPromotionSessionList();

    List<FlashPromotionProductResp> getHomeSecKillProductList();

    CartProductResp getCartProduct(Long productId);

    List<PromotionProductResp> getPromotionProductList(List<Long> ids);

    /**
     * 查找出所有的产品ID
     * @return
     */
    List<Long> getAllProductId();
}
