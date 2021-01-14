package com.practice.mybatis.resultmap.entity.myrule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@RuleType(RuleTypeEnum.TwoEndFlightRule)
@AllArgsConstructor
@NoArgsConstructor
public class MyRuleTwoEndFlight {
    /**
     * 两头班次数，多少天内
     */
    private Integer twoEndFlightNumberPer;

    /**
     * 天内执行两头班次数不能超过
     */
    private Integer twoEndFlightNumberMax;
}
