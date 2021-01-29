package com.practice.mybatis.repository.human;

import com.practice.mybatis.repository.human.entity.Woman;
import com.practice.mybatis.repository.human.entity.WomanExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WomanMapper {

    long countByExample(WomanExample example);


    int deleteByExample(WomanExample example);


    int deleteByPrimaryKey(Long id);

  
    int insert(Woman record);

  
    int insertSelective(Woman record);

   
    List<Woman> selectByExample(WomanExample example);

   
    Woman selectByPrimaryKey(Long id);

   
    int updateByExampleSelective(@Param("record") Woman record, @Param("example") WomanExample example);

   
    int updateByExample(@Param("record") Woman record, @Param("example") WomanExample example);

   
    int updateByPrimaryKeySelective(Woman record);

   
    int updateByPrimaryKey(Woman record);
}
