package com.practice.mybatis.resultmap.vo;

import com.practice.mybatis.resultmap.entity.MyRule;
import com.practice.mybatis.resultmap.entity.myrule.MyRuleBackup;
import com.practice.mybatis.resultmap.entity.myrule.MyRuleRedEyeFlight;
import com.practice.mybatis.resultmap.entity.myrule.MyRuleTwoEndFlight;
import com.practice.mybatis.resultmap.entity.myrule.RuleTypeEnum;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Luo Bao Ding
 * @since 1/14/2021
 */
@Data
public class MyRuleVO {
    private MyRule<MyRuleBackup> backupRule;
    private MyRule<MyRuleRedEyeFlight> redEyeFlightRule;
    private MyRule<MyRuleTwoEndFlight> twoEndFlightRule;

    @SuppressWarnings("rawtypes")
    public static Map<Integer, BiConsumer<MyRuleVO,MyRule>> map;
    static {
        map=new HashMap<>(RuleTypeEnum.values().length);
        map.put(RuleTypeEnum.BackupRule.getType(), MyRuleVO::setBackupRule);
        map.put(RuleTypeEnum.RedEyeFlightRule.getType(), MyRuleVO::setRedEyeFlightRule);
        map.put(RuleTypeEnum.TwoEndFlightRule.getType(), MyRuleVO::setTwoEndFlightRule);
    }
}
