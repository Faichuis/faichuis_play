package com.faichuis.faichuismall.domain;

import com.faichuis.faichuismall.model.SmsFlashPromotion;
import com.faichuis.faichuismall.model.SmsFlashPromotionProductRelation;
import lombok.Data;

import java.util.List;

/**
 * @author ：杨过
 * @date ：Created in 2020/2/18
 * @version: V1.0
 * @slogan: 天下风云出我辈，一入代码岁月催
 * @description:
 **/
@Data
public class FlashPromotionParam extends SmsFlashPromotion {
    //一个产品只能与该秒杀活动的一个活动场次关联，比如参加了10点场，就不能再参加12点场
    private List<SmsFlashPromotionProductRelation> relation;

    public List<SmsFlashPromotionProductRelation> getRelation() {
        return relation;
    }

    public void setRelation(List<SmsFlashPromotionProductRelation> relation) {
        this.relation = relation;
    }
}
