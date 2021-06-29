package com.faichuis.faichuismall.dao;

import com.faichuis.faichuismall.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品审核日志自定义dao
 * Created on 2018/4/27.
 */
public interface PmsProductVertifyRecordDao {
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
