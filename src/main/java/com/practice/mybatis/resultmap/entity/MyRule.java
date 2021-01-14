package com.practice.mybatis.resultmap.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@ToString
public class MyRule<T> {
    private Integer id;

    private Boolean enable;

    private Integer groupId;

    private Integer type;

    private T data;

    private LocalDateTime updateTime;

    public MyRule(){}

    public MyRule(Integer groupId, Integer type, T data) {
        this.groupId = groupId;
        this.type = type;
        this.data = data;
    }
}
