package com.practice.mybatis.resultmap.entity.myrule;

/**
 * @author Luo Bao Ding
 * @since 1/14/2021
 */
public enum RuleTypeEnum {
    BackupRule(1),
    RedEyeFlightRule(2),
    TwoEndFlightRule(3),
    ;
    private final int type;

    RuleTypeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
