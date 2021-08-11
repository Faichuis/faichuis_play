package com.faichuis.member;


import com.faichuis.member.request.MemberBrandAttentionRequest;
import com.faichuis.member.response.MemberBrandAttentionResponse;

import java.util.List;

/**
 * 会员关注Service
 * Created by macro on 2018/8/2.
 */
public interface MemberAttentionService {
    /**
     * 添加关注
     */
    int add(MemberBrandAttentionRequest memberBrandAttention);

    /**
     * 取消关注
     */
    int delete(Long memberId, Long brandId);

    /**
     * 获取用户关注列表
     */
    List<MemberBrandAttentionResponse> list(Long memberId);
}
