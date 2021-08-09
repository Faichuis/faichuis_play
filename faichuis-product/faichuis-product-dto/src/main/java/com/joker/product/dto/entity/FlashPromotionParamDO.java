package com.joker.product.dto.entity;

import java.util.List;

import com.faichuis.faichuismall.model.SmsFlashPromotion;
import com.faichuis.faichuismall.model.SmsFlashPromotionProductRelation;
import lombok.Data;

/**
 * @author joker
 */
@Data
public class FlashPromotionParamDO extends SmsFlashPromotion {
    /**
     * 一个产品只能与该秒杀活动的一个活动场次关联，比如参加了10点场，就不能再参加12点场
     */
    private List<SmsFlashPromotionProductRelation> relation;

    public List<SmsFlashPromotionProductRelation> getRelation() {
        return relation;
    }

    public void setRelation(List<SmsFlashPromotionProductRelation> relation) {
        this.relation = relation;
    }
}