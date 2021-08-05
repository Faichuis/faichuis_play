package com.faichuis.faichuismall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.faichuis.faichuismall.entity.UmsMemberDO;
import com.faichuis.faichuismall.model.UmsMember;
import com.faichuis.faichuismall.model.UmsMemberExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UmsMemberMapper extends BaseMapper<UmsMemberDO> {
    long countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    List<UmsMember> selectByExample(UmsMemberExample example);

    UmsMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);
}