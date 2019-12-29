package com.practice.mybatis.repository.jsonconvert;

import com.practice.mybatis.repository.jsonconvert.entity.Weather;

public interface WeatherMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Weather record);

    int insertSelective(Weather record);

    Weather selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Weather record);

    int updateByPrimaryKey(Weather record);
}