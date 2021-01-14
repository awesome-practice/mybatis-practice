package com.practice.mybatis.resultmap.service;

import com.practice.mybatis.resultmap.MyRuleMapper;
import com.practice.mybatis.resultmap.vo.MyRuleVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Luo Bao Ding
 * @since 1/14/2021
 */
@Service
@RequiredArgsConstructor
public class MyRuleService {

    private final MyRuleMapper mapper;

    public MyRuleVO query() {
        MyRuleVO vo=new MyRuleVO();
        mapper.selectAll().forEach(t->MyRuleVO.map.get(t.getType()).accept(vo, t));
        return vo;
    }
}
