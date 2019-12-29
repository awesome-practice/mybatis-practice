package com.practice.mybatis.repository.rednet;

import com.practice.mybatis.repository.rednet.entity.Resource;
import com.practice.mybatis.repository.rednet.entity.ResourceWithBLOBs;

public interface ResourceMapper {
    int deleteByPrimaryKey(Long resourceId);

    int insert(ResourceWithBLOBs record);

    int insertSelective(ResourceWithBLOBs record);

    ResourceWithBLOBs selectByPrimaryKey(Long resourceId);

    int updateByPrimaryKeySelective(ResourceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ResourceWithBLOBs record);

    int updateByPrimaryKey(Resource record);
}