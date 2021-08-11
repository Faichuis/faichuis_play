package com.joker.product.dto.entity;

import java.util.List;

import com.faichuis.faichuismall.entity.PmsProductFullReduction;
import com.faichuis.faichuismall.entity.PmsProductLadder;
import com.faichuis.faichuismall.entity.PmsSkuStock;
import com.faichuis.faichuismall.model.PmsProduct;

/**
 * 商品的促销信息，包括sku、打折优惠、满减优惠
 * @author joker
 */
public class PromotionProductDO extends PmsProduct {
    /**
     * 商品库存信息
     */
    private List<PmsSkuStock> skuStockList;
    /**
     * 商品打折信息
     */
    private List<PmsProductLadder> productLadderList;
    /**
     * 商品满减信息
     */
    private List<PmsProductFullReduction> productFullReductionList;

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }
}