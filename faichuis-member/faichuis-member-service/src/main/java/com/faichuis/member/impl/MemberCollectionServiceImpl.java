package com.faichuis.member.impl;


import com.faichuis.member.MemberCollectionService;
import com.faichuis.member.domain.MemberProductCollection;
import com.faichuis.member.request.MemberProductCollectionRequest;
import com.faichuis.member.response.MemberProductCollectionResponse;
import com.faichuis.member.service.MemberProductCollectionRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员收藏Service实现类
 * Created by macro on 2018/8/2.
 */
@Service
public class MemberCollectionServiceImpl implements MemberCollectionService {
    @Autowired
    private MemberProductCollectionRepository productCollectionRepository;

    @Override
    public int addProduct(MemberProductCollectionRequest productCollection) {
        int count = 0;
        MemberProductCollection findCollection = productCollectionRepository.findByMemberIdAndProductId(productCollection.getMemberId(), productCollection.getProductId());
        if (findCollection == null) {
            MemberProductCollection memberProductCollection = new MemberProductCollection();
            productCollectionRepository.save(memberProductCollection);
            count = 1;
        }
        return count;
    }

    @Override
    public int deleteProduct(Long memberId, Long productId) {
        return productCollectionRepository.deleteByMemberIdAndProductId(memberId, productId);
    }

    @Override
    public List<MemberProductCollectionResponse> listProduct(Long memberId) {
//        productCollectionRepository.findByMemberId(memberId);
        return Lists.newArrayList();
    }
}
