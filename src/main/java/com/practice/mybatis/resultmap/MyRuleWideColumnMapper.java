package com.practice.mybatis.resultmap;

import com.practice.mybatis.resultmap.entity.BaseMyRule;
import com.practice.mybatis.resultmap.entity.myrulewidecolumn.BackupRule;
import com.practice.mybatis.resultmap.entity.myrulewidecolumn.RedEyeFlightRule;
import com.practice.mybatis.resultmap.entity.myrulewidecolumn.TwoEndFlightRule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyRuleWideColumnMapper {
    List<BaseMyRule> selectAll();

    int insertBackupRule(@Param("entity") BackupRule entity);
    int insertRedEyeFlightRule(@Param("entity") RedEyeFlightRule entity);
    int insertTwoEndFlightRule(@Param("entity") TwoEndFlightRule entity);
}