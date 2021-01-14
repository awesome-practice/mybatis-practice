package com.practice.mybatis.repository.human.entity;

public class GirlFriend {
    private Long id;

    private String name;

    private String character;

    private String thought;

    private String appearance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought == null ? null : thought.trim();
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance == null ? null : appearance.trim();
    }
}