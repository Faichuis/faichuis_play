package com.joker.product.dto.entity;

import java.util.List;

import com.faichuis.faichuismall.entity.PmsProductAttribute;
import com.faichuis.faichuismall.entity.PmsSkuStock;
import com.faichuis.faichuismall.model.PmsProduct;

/**
 * 购物车中选择规格的商品信息
 * @author joker
 */
public class CartProductDO extends PmsProduct {
    private List<PmsProductAttribute> productAttributeList;
    private List<PmsSkuStock> skuStockList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }
}
