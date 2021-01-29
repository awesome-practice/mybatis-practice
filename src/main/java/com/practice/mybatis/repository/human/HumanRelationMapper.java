package com.practice.mybatis.repository.human;

import com.practice.mybatis.repository.human.entity.HumanRelation;
import java.util.List;

public interface HumanRelationMapper {
    
    int deleteByPrimaryKey(Long id);

    
    int insert(HumanRelation record);

    
    HumanRelation selectByPrimaryKey(Long id);

    
    List<HumanRelation> selectAll();

    
    int updateByPrimaryKey(HumanRelation record);
}
