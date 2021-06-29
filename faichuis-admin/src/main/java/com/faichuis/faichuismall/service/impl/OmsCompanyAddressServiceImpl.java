package com.faichuis.faichuismall.service.impl;

import com.faichuis.faichuismall.mapper.OmsCompanyAddressMapper;
import com.faichuis.faichuismall.model.OmsCompanyAddress;
import com.faichuis.faichuismall.model.OmsCompanyAddressExample;
import com.faichuis.faichuismall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
