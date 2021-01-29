package com.practice.mybatis.resultmap.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.mybatis.resultmap.vo.MyRuleVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Luo Bao Ding
 * @since 1/14/2021
 */
@SpringBootTest
class MyRuleServiceTest {
    @Autowired
    MyRuleService service;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void query() throws JsonProcessingException {
        MyRuleVO query = service.query();
        System.out.println("query = " + query);
        System.out.println(objectMapper.writeValueAsString(query));
    }
}