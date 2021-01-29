package com.practice.mybatis.resultmap.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
@Data
@ToString
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseMyRule {
    protected Integer id;

    protected Integer groupId;

    protected Boolean enable;

    protected Integer type;

    protected LocalDateTime updateTime;


}