package com.practice.mybatis.resultmap.vo;

import com.practice.mybatis.resultmap.entity.MyRule;
import com.practice.mybatis.resultmap.entity.myrule.MyRuleBackup;
import com.practice.mybatis.resultmap.entity.myrule.MyRuleRedEyeFlight;
import com.practice.mybatis.resultmap.entity.myrule.MyRuleTwoEndFlight;
import lombok.Data;

/**
 * @author Luo Bao Ding
 * @since 1/14/2021
 */
@Data
public class MyRuleVO {
    private MyRule<MyRuleBackup> backupRule;
    private MyRule<MyRuleRedEyeFlight> redEyeFlightRule;
    private MyRule<MyRuleTwoEndFlight> twoEndFlightRule;

}
