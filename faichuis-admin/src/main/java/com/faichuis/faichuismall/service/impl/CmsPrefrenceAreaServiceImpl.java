package com.faichuis.faichuismall.service.impl;

import com.faichuis.faichuismall.mapper.CmsPrefrenceAreaMapper;
import com.faichuis.faichuismall.model.CmsPrefrenceArea;
import com.faichuis.faichuismall.model.CmsPrefrenceAreaExample;
import com.faichuis.faichuismall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
