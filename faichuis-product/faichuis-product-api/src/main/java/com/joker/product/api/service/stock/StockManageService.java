package com.joker.product.api.service.stock;

import java.util.List;

import com.faichuis.faichuismall.common.api.CommonResult;
import com.joker.product.api.common.req.CartPromotionItemReq;


/**
 * 库存管理
 * @author joker
 */
public interface StockManageService {

    /**
     * 添加库存
     * @param productId
     * @param skuId
     * @param quanlity
     * @param miaosha
     * @return
     */
    Integer incrStock(Long productId, Long skuId, Integer quanlity, Integer miaosha, Long flashPromotionRelationId);

    /**
     * 减库存
     * @param productId
     * @param skuId
     * @param quanlity
     * @param miaosha
     * @return
     */
    Integer descStock(Long productId, Long skuId, Integer quanlity, Integer miaosha,
        Long flashPromotionRelationId);

    /**
     * 查询库存
     * @param productId
     * @param flashPromotionRelationId
     * @return
     */
    CommonResult<Integer> selectStock(Long productId, Long flashPromotionRelationId);

    /**
     * 方法实现说明:锁定库存
     * @author:smlz
     * @param
     * @return:
     * @exception:
     * @date:2020/3/16 19:36
     */
    CommonResult lockStock(List<CartPromotionItemReq> cartPromotionItemList);
}
