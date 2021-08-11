package com.faichuis.member.impl;

import com.faichuis.member.MemberAttentionService;
import com.faichuis.member.domain.MemberBrandAttention;
import com.faichuis.member.request.MemberBrandAttentionRequest;
import com.faichuis.member.response.MemberBrandAttentionResponse;
import com.faichuis.member.service.MemberBrandAttentionRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员关注Service实现类
 * Created by macro on 2018/8/2.
 */
@Service
public class MemberAttentionServiceImpl implements MemberAttentionService {
    @Autowired
    private MemberBrandAttentionRepository memberBrandAttentionRepository;

    @Override
    public int add(MemberBrandAttentionRequest request) {
        int count = 0;
        MemberBrandAttention byMemberIdAndBrandId = memberBrandAttentionRepository.findByMemberIdAndBrandId(request.getMemberId(), request.getBrandId());
        if (byMemberIdAndBrandId == null) {
            MemberBrandAttention memberBrandAttention = new MemberBrandAttention();
            memberBrandAttentionRepository.save(memberBrandAttention);
            count = 1;
        }
        return count;
    }

    @Override
    public int delete(Long memberId, Long brandId) {
        return memberBrandAttentionRepository.deleteByMemberIdAndBrandId(memberId,brandId);
    }

    @Override
    public List<MemberBrandAttentionResponse> list(Long memberId) {
//        memberBrandAttentionRepository.findByMemberId(memberId);
        return Lists.newArrayList();
    }
}
