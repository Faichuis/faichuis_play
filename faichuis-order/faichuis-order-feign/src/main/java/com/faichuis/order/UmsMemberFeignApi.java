package com.faichuis.order;

import com.faichuis.faichuismall.common.api.CommonResult;
import com.faichuis.faichuismall.model.UmsMember;
import com.faichuis.faichuismall.model.UmsMemberReceiveAddress;
import com.faichuis.order.response.PortalMemberInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* @vlog: 高于生活，源于生活
* @desc: 类的描述:远程调用 会员中心获取具体收获地址
* @author: smlz
* @createDate: 2020/1/23 15:01
* @version: 1.0
*/
@FeignClient(name = "faichuismall-member",path = "/member")
public interface UmsMemberFeignApi {

    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    @ResponseBody
    CommonResult<UmsMemberReceiveAddress> getItem(@PathVariable(value = "id") Long id);

    @RequestMapping(value = "/center/updateUmsMember",method = RequestMethod.POST)
    CommonResult<String> updateUmsMember(@RequestBody UmsMember umsMember);


    @RequestMapping(value = "/center/getMemberInfo", method = RequestMethod.GET)
    @ResponseBody
    CommonResult<PortalMemberInfo> getMemberById();

    @RequestMapping(value = "/address/list", method = RequestMethod.GET)
    @ResponseBody
    CommonResult<List<UmsMemberReceiveAddress>> list();
}
