package com.practice.mybatis.resultmap;

import com.practice.mybatis.resultmap.entity.MyRule;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface MyRuleMapper{
    <T> List<MyRule<T>> selectAll();
    <T> List<MyRule<T>> selectByType(@Param("type") Integer type);

    <T> int insert(@Param("entity") MyRule<T> entity);
}