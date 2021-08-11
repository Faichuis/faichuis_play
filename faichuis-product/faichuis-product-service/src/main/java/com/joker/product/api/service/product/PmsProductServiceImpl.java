package com.joker.product.api.service.product;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.joker.product.api.common.resp.CartProductResp;
import com.joker.product.api.common.resp.FlashPromotionProductResp;
import com.joker.product.api.common.resp.FlashPromotionSessionExtResp;
import com.joker.product.api.common.resp.PmsProductServiceResp;
import com.joker.product.api.common.resp.PromotionProductResp;
import com.joker.product.dto.entity.FlashPromotionParamDO;
import com.joker.product.dto.entity.PmsProductParamDO;
import com.joker.product.dto.mapper.FlashPromotionProductMapper;
import com.joker.product.dto.mapper.PortalProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author joker
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PortalProductMapper portalProductDao;

    @Autowired
    private FlashPromotionProductMapper flashPromotionProductDao;

    //@Autowired
    //private SmsFlashPromotionMapper flashPromotionMapper;
    //
    //@Autowired
    //private SmsFlashPromotionSessionMapper promotionSessionMapper;

    //@Autowired
    //private RedisOpsUtil redisOpsUtil;

    private Map<String, PmsProductParamDO> cacheMap = new ConcurrentHashMap<>();

    //@Autowired
    //private LocalCache cache;

    /*
     * zk分布式锁
     */
    //@Autowired
    //private ZKLock zkLock;
    private String lockPath = "/load_db";

    /**
     * add by yangguo
     * 获取商品详情信息
     * @param id 产品ID
     */
    @Override
    public PmsProductServiceResp getProductInfo(Long id){
        PmsProductServiceResp productInfo = null;
        //productInfo = cache.get(RedisKeyPrefixConst.PRODUCT_DETAIL_CACHE + id);
        //一级缓存
        if(productInfo != null){
            return productInfo;
        }

        //从二级缓存Redis里找
        //productInfo = redisOpsUtil.get(RedisKeyPrefixConst.PRODUCT_DETAIL_CACHE+id,PmsProductServiceResp.class);

        if(productInfo!=null){
            //cache.setLocalCache(RedisKeyPrefixConst.PRODUCT_DETAIL_CACHE+id,productInfo);
            return productInfo;
        }

        //if(zkLock.lock(lockPath + "_" + id)) {
            //todo 查询商品详情信息
            PmsProductParamDO pmsProductParamDO = portalProductDao.getProductInfo(id);
            if (pmsProductParamDO == null) {
                return null;
            }

            /*
             * 查询是否是秒杀商品
             */
            FlashPromotionParamDO promotion = flashPromotionProductDao.getFlashPromotion(id);
            if (!ObjectUtils.isEmpty(promotion)) {
                pmsProductParamDO.setFlashPromotionCount(promotion.getRelation().get(0).getFlashPromotionCount());
                pmsProductParamDO.setFlashPromotionLimit(promotion.getRelation().get(0).getFlashPromotionLimit());
                pmsProductParamDO.setFlashPromotionPrice(promotion.getRelation().get(0).getFlashPromotionPrice());
                pmsProductParamDO.setFlashPromotionRelationId(promotion.getRelation().get(0).getId());
                pmsProductParamDO.setFlashPromotionEndDate(promotion.getEndDate());
                pmsProductParamDO.setFlashPromotionStartDate(promotion.getStartDate());
                pmsProductParamDO.setFlashPromotionStatus(promotion.getStatus());
            }

            //todo 缓存到一级缓存
            //BeanUtils.copyProperties(pmsProductParamDO,productInfo);
            //cache.setLocalCache(RedisKeyPrefixConst.PRODUCT_DETAIL_CACHE + id, productInfo);
            ////todo 商品信息缓存到reids当中，缓存被动更新
            //redisOpsUtil.set(RedisKeyPrefixConst.PRODUCT_DETAIL_CACHE + id, pmsProductParamDO, 3600, TimeUnit.SECONDS);
            //zkLock.unlock(lockPath + "_" + id);
        //}else{
        //    productInfo = redisOpsUtil.get(RedisKeyPrefixConst.PRODUCT_DETAIL_CACHE+id,PmsProductServiceResp.class);
        //    if(productInfo != null){
        //        cache.setLocalCache(RedisKeyPrefixConst.PRODUCT_DETAIL_CACHE + id,productInfo);
        //    }
        //}
        return productInfo;
    }

    /**
     * add by yangguo
     * 获取秒杀商品列表
     * @param flashPromotionId 秒杀活动ID，关联秒杀活动设置
     * @param sessionId 场次活动ID，for example：13:00-14:00场等
     */
    @Override
    public List<FlashPromotionProductResp> getFlashProductList(Integer pageSize, Integer pageNum, Long flashPromotionId, Long sessionId){
        //PageHelper.startPage(pageNum,pageSize,"sort desc");
        //return flashPromotionProductDao.getFlashProductList(flashPromotionId,sessionId);
        return null;
    }

    /**
     * 获取当前日期秒杀活动所有场次
     * @return
     */
    @Override
    public List<FlashPromotionSessionExtResp> getFlashPromotionSessionList(){
        //Date now = new Date();
        //SmsFlashPromotion promotion = getFlashPromotion(now);
        //if(promotion != null){
        //    SmsFlashPromotionSessionExample sessionExample = new SmsFlashPromotionSessionExample();
        //    //获取时间段内的秒杀场次
        //    sessionExample.createCriteria().andStatusEqualTo(1);//启用状态
        //    sessionExample.setOrderByClause("start_time asc");
        //    List<SmsFlashPromotionSession> promotionSessionList = promotionSessionMapper.selectByExample(sessionExample);
        //    List<FlashPromotionSessionExt> extList = new ArrayList<>();
        //    if(!CollectionUtils.isEmpty(promotionSessionList)){
        //        promotionSessionList.stream().forEach((item)->{
        //            FlashPromotionSessionExt ext = new FlashPromotionSessionExt();
        //            BeanUtils.copyProperties(item,ext);
        //            ext.setFlashPromotionId(promotion.getId());
        //            if(DateUtil.getTime(now).after(DateUtil.getTime(ext.getStartTime()))
        //                && DateUtil.getTime(now).before(DateUtil.getTime(ext.getEndTime()))){
        //                //活动进行中
        //                ext.setSessionStatus(0);
        //            }else if(DateUtil.getTime(now).after(DateUtil.getTime(ext.getEndTime()))){
        //                //活动即将开始
        //                ext.setSessionStatus(1);
        //            }else if(DateUtil.getTime(now).before(DateUtil.getTime(ext.getStartTime()))){
        //                //活动已结束
        //                ext.setSessionStatus(2);
        //            }
        //            extList.add(ext);
        //        });
        //        return extList;
        //    }
        //}
        return null;
    }

    //根据时间获取秒杀活动
    //public SmsFlashPromotion getFlashPromotion(Date date) {
    //    Date currDate = DateUtil.getDate(date);
    //    SmsFlashPromotionExample example = new SmsFlashPromotionExample();
    //    example.createCriteria()
    //        .andStatusEqualTo(1)
    //        .andStartDateLessThanOrEqualTo(currDate)
    //        .andEndDateGreaterThanOrEqualTo(currDate);
    //    List<SmsFlashPromotion> flashPromotionList = flashPromotionMapper.selectByExample(example);
    //    if (!CollectionUtils.isEmpty(flashPromotionList)) {
    //        return flashPromotionList.get(0);
    //    }
    //    return null;
    //}

    /**
     * 获取首页的秒杀商品列表
     * @return
     */
    @Override
    public List<FlashPromotionProductResp> getHomeSecKillProductList(){
        //PageHelper.startPage(1,8,"sort desc");
        //FlashPromotionParam flashPromotionParam = flashPromotionProductDao.getFlashPromotion(null);
        //if(flashPromotionParam==null || CollectionUtils.isEmpty(flashPromotionParam.getRelation())){
        //    return null;
        //}
        //List<Long> promotionIds = new ArrayList<>();
        //flashPromotionParam.getRelation().stream().forEach(item->{
        //    promotionIds.add(item.getId());
        //});
        //PageHelper.clearPage();
        //return flashPromotionProductDao.getHomePromotionProductList(promotionIds);
        return null;
    }

    @Override
    public CartProductResp getCartProduct(Long productId) {
        //return portalProductDao.getCartProduct(productId);
        return null;
    }

    @Override
    public List<PromotionProductResp> getPromotionProductList(List<Long> ids) {
        //return portalProductDao.getPromotionProductList(ids);
        return null;
    }

    /**
     * 查找出所有的产品ID
     * @return
     */
    @Override
    public List<Long> getAllProductId(){
        return portalProductDao.getAllProductId();
    }
}
