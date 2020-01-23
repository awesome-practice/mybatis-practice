package com.practice.mybatis.repository.verifyjsonconvert;

import com.practice.mybatis.repository.verifyjsonconvert.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long id);

    List<Person> selectAll();

    List<String> selectHobbys(Long id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKeyWithBLOBs(Person record);
}
