package com.practice.mybatis.resultmap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.mybatis.resultmap.entity.MyRule;
import com.practice.mybatis.resultmap.entity.myrule.*;
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
class MyRuleMapperTest {

    @Autowired
    MyRuleMapper mapper;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void insert() {
        int groupId = 1;
        int insert = mapper.insert(new MyRule<>(groupId, MyRuleBackup.class.getAnnotation(RuleType.class).value().getType(), new MyRuleBackup(2, 5)));
        Assertions.assertEquals(insert, 1);
        insert = mapper.insert(new MyRule<>(groupId, MyRuleRedEyeFlight.class.getAnnotation(RuleType.class).value().getType(), new MyRuleRedEyeFlight(1, 3)));
        Assertions.assertEquals(insert, 1);
        insert = mapper.insert(new MyRule<>(groupId, MyRuleTwoEndFlight.class.getAnnotation(RuleType.class).value().getType(), new MyRuleTwoEndFlight(3, 6)));
        Assertions.assertEquals(insert, 1);

    }

    @Test
    void selectAll() throws JsonProcessingException {
        List<MyRule<Object>> myRules = mapper.selectAll();
        System.out.println(Arrays.toString(myRules.toArray()));
        System.out.println(objectMapper.writeValueAsString(myRules));
    }
    @Test
    void selectByType() throws JsonProcessingException {
        List<MyRule<MyRuleBackup>> myRules = mapper.selectByType(RuleTypeEnum.BackupRule.getType());
        System.out.println(Arrays.toString(myRules.toArray()));
        System.out.println(objectMapper.writeValueAsString(myRules));
    }

}