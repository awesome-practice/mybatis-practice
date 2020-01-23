package com.practice.mybatis.repository.human.entity;

import javax.annotation.Generated;

public class GirlFriend {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.478+08:00", comments="Source field: girl_friend.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.character")
    private String character;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.thought")
    private String thought;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.483+08:00", comments="Source field: girl_friend.appearance")
    private String appearance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.481+08:00", comments="Source field: girl_friend.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.character")
    public String getCharacter() {
        return character;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.character")
    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.thought")
    public String getThought() {
        return thought;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.482+08:00", comments="Source field: girl_friend.thought")
    public void setThought(String thought) {
        this.thought = thought == null ? null : thought.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.483+08:00", comments="Source field: girl_friend.appearance")
    public String getAppearance() {
        return appearance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.483+08:00", comments="Source field: girl_friend.appearance")
    public void setAppearance(String appearance) {
        this.appearance = appearance == null ? null : appearance.trim();
    }
}