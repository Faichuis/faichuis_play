package com.joker.product.api.common.resp;

import java.util.List;

import com.faichuis.faichuismall.model.PmsProductAttribute;
import com.faichuis.faichuismall.model.PmsSkuStock;

/**
 * 购物车中选择规格的商品信息
 * @author joker
 */
public class CartProductResp {
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
