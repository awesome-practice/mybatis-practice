package com.practice.mybatis.resultmap.entity.myrule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@RuleType(RuleTypeEnum.BackupRule)
@AllArgsConstructor
@NoArgsConstructor
public class MyRuleBackup {
    /**
     * 天内备份次数不能超过
     */
    private Integer backupNumberPer;

    /**
     * 天内备份次数不能超过
     */
    private Integer backupNumberMax;

}
