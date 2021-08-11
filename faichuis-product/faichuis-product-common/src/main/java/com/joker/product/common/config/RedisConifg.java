package com.joker.product.common.config;

import com.faichuis.faichuismall.common.constant.RedisKeyPrefixConst;
import com.joker.product.common.util.RedisOpsUtil;
import com.joker.product.dto.mapper.FlashPromotionProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：杨过
 * @date ：Created in 2020/2/17
 * @version: V1.0
 * @slogan: 天下风云出我辈，一入代码岁月催
 * @description:
 **/
@Slf4j
@Configuration
public class RedisConifg implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {

    }
    //
    //@Autowired
    //private RedisConnectionFactory connectionFactory;
    //
    //@Bean
    //@Primary
    //public RedisTemplate<String,Object> redisTemplate(){
    //    RedisTemplate<String,Object> template = new RedisTemplate();
    //    template.setConnectionFactory(connectionFactory);
    //    // 序列化后会产生java类型说明，如果不需要用“Jackson2JsonRedisSerializer”和“ObjectMapper ”配合效果更好
    //    Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
    //    ObjectMapper om = new ObjectMapper();
    //    om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    //    om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    //    jackson2JsonRedisSerializer.setObjectMapper(om);
    //
    //    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
    //    template.setKeySerializer(stringRedisSerializer);
    //    template.setValueSerializer(jackson2JsonRedisSerializer);
    //
    //    template.setHashKeySerializer(jackson2JsonRedisSerializer);
    //    template.setHashValueSerializer(jackson2JsonRedisSerializer);
    //
    //    template.afterPropertiesSet();
    //    return template;
    //}
    //
    //@Bean
    //public RedisOpsUtil redisOpsUtil(){
    //    return new RedisOpsUtil();
    //}
    //
    //@Autowired
    //private FlashPromotionProductMapper flashPromotionProductMapper;
    //
    ///**
    // * 加载所有的秒杀活动商品库存到缓存redis中
    // * @throws Exception
    // */
    //@Override
    //public void afterPropertiesSet() throws Exception {
    //    //todo  获取所有的秒杀活动中商品
    //    FlashPromotionParamDO promotion = flashPromotionProductMapper.getFlashPromotion(null);
    //    Date now = new Date();
    //    Date endDate = promotion.getEndDate();//结束时间
    //    final Long expired = endDate.getTime()-now.getTime();//剩余时间
    //    //秒杀商品库存缓存到redis
    //    promotion.getRelation().stream().forEach((item)->{
    //        redisOpsUtil().setIfAbsent(
    //                RedisKeyPrefixConst.MIAOSHA_STOCK_CACHE_PREFIX + item.getProductId()
    //                , item.getFlashPromotionCount()
    //                , expired
    //                , TimeUnit.MILLISECONDS);
    //    });
    //}
}