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
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<GirlFriend> insertStatement);

    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("GirlFriendResult")
    GirlFriend selectOne(SelectStatementProvider selectStatement);

    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "GirlFriendResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "character", property = "character", jdbcType = JdbcType.VARCHAR),
            @Result(column = "thought", property = "thought", jdbcType = JdbcType.VARCHAR),
            @Result(column = "appearance", property = "appearance", jdbcType = JdbcType.VARCHAR)
    })
    List<GirlFriend> selectMany(SelectStatementProvider selectStatement);

    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(girlFriend);
    }

    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, girlFriend);
    }

    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, girlFriend)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

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

    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<GirlFriend>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, character, thought, appearance)
                .from(girlFriend);
    }

    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<GirlFriend>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, character, thought, appearance)
                .from(girlFriend);
    }

    default GirlFriend selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, character, thought, appearance)
                .from(girlFriend)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(GirlFriend record) {
        return UpdateDSL.updateWithMapper(this::update, girlFriend)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(character).equalTo(record::getCharacter)
                .set(thought).equalTo(record::getThought)
                .set(appearance).equalTo(record::getAppearance);
    }

    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(GirlFriend record) {
        return UpdateDSL.updateWithMapper(this::update, girlFriend)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(character).equalToWhenPresent(record::getCharacter)
                .set(thought).equalToWhenPresent(record::getThought)
                .set(appearance).equalToWhenPresent(record::getAppearance);
    }

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
