package com.faichuis.faichuismall.search.dao;

import com.faichuis.faichuismall.search.domain.EsProduct;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * Created on 2018/6/19.
 */
public interface EsProductDao {


    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
