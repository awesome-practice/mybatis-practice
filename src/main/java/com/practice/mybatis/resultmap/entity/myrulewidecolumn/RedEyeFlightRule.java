package com.practice.mybatis.resultmap.entity.myrulewidecolumn;

import com.practice.mybatis.resultmap.entity.BaseMyRule;
import com.practice.mybatis.resultmap.entity.myrule.RuleType;
import com.practice.mybatis.resultmap.entity.myrule.RuleTypeEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@RuleType(RuleTypeEnum.RedEyeFlightRule)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class RedEyeFlightRule extends BaseMyRule {
    /**
     * 红眼航班次数，多少天内
     */
    private Integer redEyeFlightNumberPer;

    /**
     * 红眼航班次数，多少天内不能超过
     */
    private Integer redEyeFlightNumberMax;

}
