package com.faichuis.member;


import com.faichuis.member.request.MemberProductCollectionRequest;
import com.faichuis.member.response.MemberProductCollectionResponse;

import java.util.List;

/**
 * 会员收藏Service
 * Created by macro on 2018/8/2.
 */
public interface MemberCollectionService {

    int addProduct(MemberProductCollectionRequest productCollection);

    int deleteProduct(Long memberId, Long productId);

    List<MemberProductCollectionResponse> listProduct(Long memberId);
}
