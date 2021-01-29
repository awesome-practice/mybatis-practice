package com.practice.mybatis.resultmap.entity.myrulewidecolumn;

import com.practice.mybatis.resultmap.entity.BaseMyRule;
import com.practice.mybatis.resultmap.entity.myrule.RuleType;
import com.practice.mybatis.resultmap.entity.myrule.RuleTypeEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@RuleType(RuleTypeEnum.TwoEndFlightRule)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class TwoEndFlightRule extends BaseMyRule {
    /**
     * 两头班次数，多少天内
     */
    private Integer twoEndFlightNumberPer;

    /**
     * 天内执行两头班次数不能超过
     */
    private Integer twoEndFlightNumberMax;
}
