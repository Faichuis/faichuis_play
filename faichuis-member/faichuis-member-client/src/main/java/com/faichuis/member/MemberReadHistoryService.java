package com.faichuis.member;



import com.faichuis.member.request.MemberReadHistoryReq;
import com.faichuis.member.response.MemberReadHistoryResp;

import java.util.List;

/**
 * 会员浏览记录管理Service
 * Created by macro on 2018/8/3.
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistoryReq memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistoryResp> list(Long memberId);
}
