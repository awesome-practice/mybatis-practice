package com.practice.mybatis.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GirlFriendDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.486+08:00", comments="Source Table: girl_friend")
    public static final GirlFriend girlFriend = new GirlFriend();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.487+08:00", comments="Source field: girl_friend.id")
    public static final SqlColumn<Long> id = girlFriend.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.487+08:00", comments="Source field: girl_friend.name")
    public static final SqlColumn<String> name = girlFriend.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.487+08:00", comments="Source field: girl_friend.character")
    public static final SqlColumn<String> character = girlFriend.character;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.487+08:00", comments="Source field: girl_friend.thought")
    public static final SqlColumn<String> thought = girlFriend.thought;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.487+08:00", comments="Source field: girl_friend.appearance")
    public static final SqlColumn<String> appearance = girlFriend.appearance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.487+08:00", comments="Source Table: girl_friend")
    public static final class GirlFriend extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> character = column("character", JDBCType.VARCHAR);

        public final SqlColumn<String> thought = column("thought", JDBCType.VARCHAR);

        public final SqlColumn<String> appearance = column("appearance", JDBCType.VARCHAR);

        public GirlFriend() {
            super("girl_friend");
        }
    }
}