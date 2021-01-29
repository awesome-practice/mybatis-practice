package com.practice.mybatis.repository.human;

import java.sql.JDBCType;
import javax.annotation.Generated;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GirlFriendDynamicSqlSupport {
    public static final GirlFriend girlFriend = new GirlFriend();

    public static final SqlColumn<Long> id = girlFriend.id;

    public static final SqlColumn<String> name = girlFriend.name;

    public static final SqlColumn<String> character = girlFriend.character;

    public static final SqlColumn<String> thought = girlFriend.thought;

    public static final SqlColumn<String> appearance = girlFriend.appearance;

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
