package com.joker.product.api.service.stock;

import java.util.Date;
import java.util.List;

import com.faichuis.faichuismall.common.api.CommonResult;
import com.faichuis.faichuismall.mapper.PmsSkuStockMapper;
import com.faichuis.faichuismall.mapper.SmsFlashPromotionProductRelationMapper;
import com.faichuis.faichuismall.model.PmsSkuStock;
import com.faichuis.faichuismall.model.SmsFlashPromotionProductRelation;
import com.joker.product.api.common.req.CartPromotionItemReq;
import com.joker.product.api.service.product.PmsProductService;
import com.joker.product.dto.entity.PmsProductParamDO;
import com.joker.product.dto.mapper.FlashPromotionProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 *
 * @author ：杨过
 * @date ：Created in 2020/2/25
 * @version: V1.0
 * @slogan: 天下风云出我辈，一入代码岁月催
 * @description:
 **/
@Service
@Slf4j
public class StockManageServiceImpl implements StockManageService {

    @Autowired
    private PmsSkuStockMapper skuStockMapper;

    @Autowired
    private SmsFlashPromotionProductRelationMapper flashPromotionProductRelationMapper;

    @Autowired
    private FlashPromotionProductMapper flashPromotionProductDao;

    @Autowired
    private PmsProductService productService;

    //@Autowired
    //private RedisOpsUtil redisOpsUtil;

    @Override
    public Integer incrStock(Long productId, Long skuId, Integer quanlity, Integer miaosha, Long flashPromotionRelationId) {
        return null;
    }

    @Override
    public Integer descStock(Long productId, Long skuId, Integer quanlity, Integer miaosha, Long flashPromotionRelationId) {
        return null;
    }

    /**
     * 获取产品库存
     * @param productId
     * @param flashPromotionRelationId
     * @return
     */
    @Override
    public CommonResult<Integer> selectStock(Long productId, Long flashPromotionRelationId) {

        SmsFlashPromotionProductRelation miaoshaStock = flashPromotionProductRelationMapper.selectByPrimaryKey(flashPromotionRelationId);
        if(ObjectUtils.isEmpty(miaoshaStock)){
            return CommonResult.failed("不存在该秒杀商品！");
        }

        return CommonResult.success(miaoshaStock.getFlashPromotionCount());
    }

    @Override
    public CommonResult lockStock(List<CartPromotionItemReq> cartPromotionItemList) {
        try {

            for (CartPromotionItemReq cartPromotionItem : cartPromotionItemList) {
                PmsSkuStock skuStock = skuStockMapper.selectByPrimaryKey(cartPromotionItem.getProductSkuId());
                skuStock.setLockStock(skuStock.getLockStock() + cartPromotionItem.getQuantity());
                skuStockMapper.updateByPrimaryKeySelective(skuStock);
            }
            return CommonResult.success(true);
        }catch (Exception e) {
            log.error("锁定库存失败...");
            return CommonResult.failed();
        }
    }

    //验证秒杀时间
    private boolean volidateMiaoShaTime(PmsProductParamDO product) {
        //当前时间
        Date now = new Date();
        //todo 查看是否有秒杀商品,秒杀商品库存
        if(product.getFlashPromotionStatus() != 1
                || product.getFlashPromotionEndDate() == null
                || product.getFlashPromotionStartDate() == null
                || now.after(product.getFlashPromotionEndDate())
                || now.before(product.getFlashPromotionStartDate())){
            return false;
        }
        return true;
    }

}
