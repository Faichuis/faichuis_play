package com.faichuis.member.controller;

import com.faichuis.faichuismall.common.api.CommonResult;
import com.faichuis.member.MemberReadHistoryService;
import com.faichuis.member.domain.MemberReadHistory;
import com.faichuis.member.request.MemberReadHistoryReq;
import com.faichuis.member.response.MemberReadHistoryResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员商品浏览记录管理Controller
 * Created by macro on 2018/8/3.
 */
@Controller
@Api(tags = "MemberReadHistoryController", description = "会员商品浏览记录管理")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
    @Autowired
    private MemberReadHistoryService memberReadHistoryService;

    @ApiOperation("创建浏览记录")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) {

        MemberReadHistoryReq memberReadHistoryReq = new MemberReadHistoryReq();
        int count = memberReadHistoryService.create(memberReadHistoryReq);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除浏览记录")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<String> ids) {
        int count = memberReadHistoryService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("展示浏览记录")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberReadHistoryResp>> list(Long memberId) {
        List<MemberReadHistoryResp> list = memberReadHistoryService.list(memberId);
        return CommonResult.success(list);
    }
}
