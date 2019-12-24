package com.practice.mybatis.util.snowflake;

/**
 * @author Luo Bao Ding
 * @since 2019/11/21
 */
public class SequenceGenerator {
    private static final ProtectedSequenceGenerator sequenceGenerator = new ProtectedSequenceGenerator();

    private SequenceGenerator() {
    }

    public static long nextId() {
        return sequenceGenerator.nextId();
    }

}
