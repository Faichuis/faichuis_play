package com.joker.product.dto.mapper;

import java.util.List;

import com.joker.product.dto.entity.FlashPromotionParamDO;
import com.joker.product.dto.entity.FlashPromotionProductDO;
import org.apache.ibatis.annotations.Param;

/**
 * 首页内容管理自定义Dao
 * Created by macro on 2019/1/28.
 */
public interface FlashPromotionProductMapper {

    /**
     * 获取秒杀商品
     * @param flashPromotionId 秒杀活动ID，关联秒杀活动设置
     * @param sessionId 场次活动ID，for example：13:00-14:00场等
     */
    List<FlashPromotionProductDO> getFlashProductList(@Param("flashPromotionId") Long flashPromotionId,
        @Param("sessionId") Long sessionId);


    List<FlashPromotionProductDO> getHomePromotionProductList(@Param("promotionIds") List<Long> promotionIds);

    /**
     * 查找所有的秒杀活动商品
     * @return
     */
    FlashPromotionParamDO getFlashPromotion(@Param("pid") Long pid);
}
