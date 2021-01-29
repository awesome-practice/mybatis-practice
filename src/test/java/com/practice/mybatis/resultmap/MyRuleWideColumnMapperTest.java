package com.practice.mybatis.resultmap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.mybatis.resultmap.entity.BaseMyRule;
import com.practice.mybatis.resultmap.entity.myrule.RuleType;
import com.practice.mybatis.resultmap.entity.myrulewidecolumn.BackupRule;
import com.practice.mybatis.resultmap.entity.myrulewidecolumn.RedEyeFlightRule;
import com.practice.mybatis.resultmap.entity.myrulewidecolumn.TwoEndFlightRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author Luo Bao Ding
 * @since 1/14/2021
 */
@SpringBootTest
class MyRuleWideColumnMapperTest {
    @Autowired
    MyRuleWideColumnMapper mapper;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void insert() {
        int groupId = 1;
        int insert = mapper.insertBackupRule(BackupRule.builder().groupId(groupId).type(BackupRule.class.getAnnotation(RuleType.class).value().getType())
                .backupNumberPer(2).backupNumberMax(5).build());
        Assertions.assertEquals(insert, 1);

        insert = mapper.insertRedEyeFlightRule(RedEyeFlightRule.builder().groupId(groupId).type(RedEyeFlightRule.class.getAnnotation(RuleType.class).value().getType())
                .redEyeFlightNumberPer(1).redEyeFlightNumberMax(3).build());
        Assertions.assertEquals(insert, 1);

        insert = mapper.insertTwoEndFlightRule(TwoEndFlightRule.builder().groupId(groupId).type(TwoEndFlightRule.class.getAnnotation(RuleType.class).value().getType())
                .twoEndFlightNumberPer(3).twoEndFlightNumberMax(6).build());
        Assertions.assertEquals(insert, 1);

    }

    @Test
    void selectAll() throws JsonProcessingException {
        List<BaseMyRule> myRules = mapper.selectAll();
        System.out.println(Arrays.toString(myRules.toArray()));
        System.out.println(objectMapper.writeValueAsString(myRules));
    }

}