package com.faichuis.faichuismall.portal.domain;

import com.faichuis.faichuismall.model.CmsSubject;
import com.faichuis.faichuismall.model.PmsBrand;
import com.faichuis.faichuismall.model.PmsProduct;
import com.faichuis.faichuismall.model.SmsHomeAdvertise;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 首页内容返回信息封装
 * Created by tuling on 2019/1/28.
 */
@Getter
@Setter
public class HomeContentResult {
    //轮播广告
    private List<SmsHomeAdvertise> advertiseList;
    //推荐品牌
    private List<PmsBrand> brandList;

    private List<FlashPromotionProduct> homeFlashPromotion;
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    private List<PmsProduct> hotProductList;
    //推荐专题
    private List<CmsSubject> subjectList;
}
