package com.faichuis.member.controller;

import com.faichuis.faichuismall.common.api.CommonResult;
import com.faichuis.member.MemberCollectionService;
import com.faichuis.member.domain.MemberProductCollection;
import com.faichuis.member.request.MemberProductCollectionRequest;
import com.faichuis.member.response.MemberProductCollectionResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 会员收藏管理Controller
 * Created by macro on 2018/8/2.
 */
@Controller
@Api(tags = "MemberCollectionController", description = "会员收藏管理")
@RequestMapping("/member/collection")
public class MemberCollectionController {

    @Autowired
    private MemberCollectionService memberCollectionService;

    @ApiOperation("添加商品收藏")
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addProduct(@RequestBody MemberProductCollection productCollection) {
        MemberProductCollectionRequest request = new MemberProductCollectionRequest();
        int count = memberCollectionService.addProduct(request);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除收藏商品")
    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteProduct(Long memberId, Long productId) {
        int count = memberCollectionService.deleteProduct(memberId, productId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示关注列表")
    @RequestMapping(value = "/listProduct/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberProductCollectionResponse>> listProduct(@PathVariable Long memberId) {
        List<MemberProductCollectionResponse> memberProductCollectionList = memberCollectionService.listProduct(memberId);
        return CommonResult.success(memberProductCollectionList);
    }
}
