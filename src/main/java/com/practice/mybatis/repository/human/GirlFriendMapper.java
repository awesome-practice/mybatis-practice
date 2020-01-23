package com.practice.mybatis.repository.human;

import static com.practice.mybatis.repository.human.GirlFriendDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.practice.mybatis.repository.human.entity.GirlFriend;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface GirlFriendMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.488+08:00", comments="Source Table: girl_friend")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.489+08:00", comments="Source Table: girl_friend")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.489+08:00", comments="Source Table: girl_friend")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GirlFriend> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.49+08:00", comments="Source Table: girl_friend")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GirlFriendResult")
    GirlFriend selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.49+08:00", comments="Source Table: girl_friend")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GirlFriendResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="character", property="character", jdbcType=JdbcType.VARCHAR),
        @Result(column="thought", property="thought", jdbcType=JdbcType.VARCHAR),
        @Result(column="appearance", property="appearance", jdbcType=JdbcType.VARCHAR)
    })
    List<GirlFriend> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.491+08:00", comments="Source Table: girl_friend")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.492+08:00", comments="Source Table: girl_friend")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(girlFriend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.492+08:00", comments="Source Table: girl_friend")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, girlFriend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.493+08:00", comments="Source Table: girl_friend")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, girlFriend)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.493+08:00", comments="Source Table: girl_friend")
    default int insert(GirlFriend record) {
        return insert(SqlBuilder.insert(record)
                .into(girlFriend)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(character).toProperty("character")
                .map(thought).toProperty("thought")
                .map(appearance).toProperty("appearance")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.494+08:00", comments="Source Table: girl_friend")
    default int insertSelective(GirlFriend record) {
        return insert(SqlBuilder.insert(record)
                .into(girlFriend)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(character).toPropertyWhenPresent("character", record::getCharacter)
                .map(thought).toPropertyWhenPresent("thought", record::getThought)
                .map(appearance).toPropertyWhenPresent("appearance", record::getAppearance)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.494+08:00", comments="Source Table: girl_friend")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<GirlFriend>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, character, thought, appearance)
                .from(girlFriend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.495+08:00", comments="Source Table: girl_friend")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<GirlFriend>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, character, thought, appearance)
                .from(girlFriend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.495+08:00", comments="Source Table: girl_friend")
    default GirlFriend selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, character, thought, appearance)
                .from(girlFriend)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.496+08:00", comments="Source Table: girl_friend")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(GirlFriend record) {
        return UpdateDSL.updateWithMapper(this::update, girlFriend)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(character).equalTo(record::getCharacter)
                .set(thought).equalTo(record::getThought)
                .set(appearance).equalTo(record::getAppearance);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.496+08:00", comments="Source Table: girl_friend")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(GirlFriend record) {
        return UpdateDSL.updateWithMapper(this::update, girlFriend)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(character).equalToWhenPresent(record::getCharacter)
                .set(thought).equalToWhenPresent(record::getThought)
                .set(appearance).equalToWhenPresent(record::getAppearance);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.497+08:00", comments="Source Table: girl_friend")
    default int updateByPrimaryKey(GirlFriend record) {
        return UpdateDSL.updateWithMapper(this::update, girlFriend)
                .set(name).equalTo(record::getName)
                .set(character).equalTo(record::getCharacter)
                .set(thought).equalTo(record::getThought)
                .set(appearance).equalTo(record::getAppearance)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-09-03T09:37:35.497+08:00", comments="Source Table: girl_friend")
    default int updateByPrimaryKeySelective(GirlFriend record) {
        return UpdateDSL.updateWithMapper(this::update, girlFriend)
                .set(name).equalToWhenPresent(record::getName)
                .set(character).equalToWhenPresent(record::getCharacter)
                .set(thought).equalToWhenPresent(record::getThought)
                .set(appearance).equalToWhenPresent(record::getAppearance)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}