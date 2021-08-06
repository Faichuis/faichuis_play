package com.joker.product.dto.mapper;

import java.util.List;

import com.joker.product.dto.entity.CartProductDO;
import com.joker.product.dto.entity.PmsProductParamDO;
import com.joker.product.dto.entity.PromotionProductDO;
import org.apache.ibatis.annotations.Param;

/**
 * 前台系统自定义商品Dao
 * Created by macro on 2018/8/2.
 */
public interface PortalProductMapper {
    CartProductDO getCartProduct(@Param("id") Long id);
    List<PromotionProductDO> getPromotionProductList(@Param("ids") List<Long> ids);

    /**
     * add by yangguo
     * 获取商品详情信息
     * @param id 产品ID
     */
    PmsProductParamDO getProductInfo(@Param("id") Long id);

    /**
     * 查找出所有的产品ID
     * @return
     */
    List<Long> getAllProductId();
}
