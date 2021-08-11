package com.faichuis.member.controller;

import com.faichuis.faichuismall.common.api.CommonResult;
import com.faichuis.member.MemberAttentionService;
import com.faichuis.member.domain.MemberBrandAttention;
import com.faichuis.member.request.MemberBrandAttentionRequest;
import com.faichuis.member.response.MemberBrandAttentionResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员关注品牌管理Controller
 * Created by macro on 2018/8/2.
 */
@Controller
@Api(tags = "MemberAttentionController", description = "会员关注品牌管理")
@RequestMapping("/member/attention")
public class MemberAttentionController {

    @Autowired
    private MemberAttentionService memberAttentionService;


    @ApiOperation("添加品牌关注")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody MemberBrandAttention memberBrandAttention) {

        MemberBrandAttentionRequest request = new MemberBrandAttentionRequest();
        int count = memberAttentionService.add(request);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("取消关注")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(Long memberId, Long brandId) {
        int count = memberAttentionService.delete(memberId,brandId);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示关注列表")
    @RequestMapping(value = "/list/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberBrandAttentionResponse>> list(@PathVariable Long memberId) {
        List<MemberBrandAttentionResponse> list = memberAttentionService.list(memberId);
        return CommonResult.success(list);
    }
}
