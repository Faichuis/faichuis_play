package com.faichuis.member.impl;


import com.faichuis.member.MemberReadHistoryService;
import com.faichuis.member.domain.MemberReadHistory;
import com.faichuis.member.request.MemberReadHistoryReq;
import com.faichuis.member.response.MemberReadHistoryResp;
import com.faichuis.member.service.MemberReadHistoryRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 会员浏览记录管理Service实现类
 * Created by macro on 2018/8/3.
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {


    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;
    @Override
    public int create(MemberReadHistoryReq request) {

        MemberReadHistory memberReadHistory = new MemberReadHistory();

        BeanUtils.copyProperties(request,memberReadHistory);

        memberReadHistory.setId(null);

        memberReadHistory.setCreateTime(new Date());

        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        List<MemberReadHistory> deleteList = new ArrayList<>();
        for(String id:ids){
            MemberReadHistory memberReadHistory = new MemberReadHistory();
            memberReadHistory.setId(id);
            deleteList.add(memberReadHistory);
        }
        memberReadHistoryRepository.deleteAll(deleteList);
        return ids.size();
    }

    @Override
    public List<MemberReadHistoryResp> list(Long memberId) {

        List<MemberReadHistory> byMemberIdOrderByCreateTimeDesc = memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);

        List<MemberReadHistoryResp> list = Lists.newArrayList();

        for (MemberReadHistory memberReadHistory : byMemberIdOrderByCreateTimeDesc) {
            MemberReadHistoryResp memberReadHistoryResp = new MemberReadHistoryResp();
            BeanUtils.copyProperties(memberReadHistory,memberReadHistoryResp);

            list.add(memberReadHistoryResp);
        }

        return list;
    }
}
