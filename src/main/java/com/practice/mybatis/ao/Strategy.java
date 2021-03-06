package com.practice.mybatis.ao;

/**
 * @author Luo Bao Ding
 * @since 2019/11/22
 */
public enum Strategy {
    FIRST("FIRST"),SECOND("SECOND");

    private String name;

    Strategy(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
