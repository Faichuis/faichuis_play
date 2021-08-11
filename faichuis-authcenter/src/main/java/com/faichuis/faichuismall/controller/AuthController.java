package com.faichuis.faichuismall.controller;

import com.faichuis.faichuismall.common.api.CommonResult;
import com.faichuis.faichuismall.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @PostMapping("/login")
    public CommonResult login(@RequestBody String userName){


        return CommonResult.success("123");
    }
}
