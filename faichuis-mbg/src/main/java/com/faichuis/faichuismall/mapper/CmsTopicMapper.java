package com.faichuis.faichuismall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.faichuis.faichuismall.entity.CmsTopicDO;
import com.faichuis.faichuismall.model.CmsTopic;
import com.faichuis.faichuismall.model.CmsTopicExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicMapper extends BaseMapper<CmsTopicDO> {
    long countByExample(CmsTopicExample example);

    int deleteByExample(CmsTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsTopic record);

    int insertSelective(CmsTopic record);

    List<CmsTopic> selectByExampleWithBLOBs(CmsTopicExample example);

    List<CmsTopic> selectByExample(CmsTopicExample example);

    CmsTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByExample(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByPrimaryKeySelective(CmsTopic record);

    int updateByPrimaryKeyWithBLOBs(CmsTopic record);

    int updateByPrimaryKey(CmsTopic record);
}