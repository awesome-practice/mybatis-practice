package com.practice.mybatis.resultmap.entity.myrule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@RuleType(RuleTypeEnum.RedEyeFlightRule)
@AllArgsConstructor
@NoArgsConstructor
public class MyRuleRedEyeFlight {
    /**
     * 红眼航班次数，多少天内
     */
    private Integer redEyeFlightNumberPer;

    /**
     * 红眼航班次数，多少天内不能超过
     */
    private Integer redEyeFlightNumberMax;

}
