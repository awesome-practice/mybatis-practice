package com.practice.mybatis.util;

/**
 * @author Luo Bao Ding
 * @since 2019/11/21
 */
public class TableShard {
    public static String getActor() {
        return "actor";
    }

    public static String getActorBySuffix(String suffix) {
        return "act"+suffix;
    }
    public static String getIndex(String input) {
        return input;
    }

    public static String getSuffix(String suffix) {
        return suffix;
    }

}
