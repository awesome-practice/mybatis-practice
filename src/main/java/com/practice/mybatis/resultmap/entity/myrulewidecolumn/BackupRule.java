package com.practice.mybatis.resultmap.entity.myrulewidecolumn;

import com.practice.mybatis.resultmap.entity.BaseMyRule;
import com.practice.mybatis.resultmap.entity.myrule.RuleType;
import com.practice.mybatis.resultmap.entity.myrule.RuleTypeEnum;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@RuleType(RuleTypeEnum.BackupRule)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
@SuperBuilder
public class BackupRule extends BaseMyRule {
    /**
     * 天内备份次数不能超过
     */
    private Integer backupNumberPer;

    /**
     * 天内备份次数不能超过
     */
    private Integer backupNumberMax;

}
