package com.faichuis.faichuismall.service;

import com.faichuis.faichuismall.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;


}
