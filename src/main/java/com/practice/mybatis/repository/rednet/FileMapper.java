package com.practice.mybatis.repository.rednet;

import com.practice.mybatis.repository.rednet.entity.File;
import com.practice.mybatis.repository.rednet.entity.FileWithBLOBs;

public interface FileMapper {
    int deleteByPrimaryKey(Long resourceId);

    int insert(FileWithBLOBs record);

    int insertSelective(FileWithBLOBs record);

    FileWithBLOBs selectByPrimaryKey(Long resourceId);

    int updateByPrimaryKeySelective(FileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FileWithBLOBs record);

    int updateByPrimaryKey(File record);
}