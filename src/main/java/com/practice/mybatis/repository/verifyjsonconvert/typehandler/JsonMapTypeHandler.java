package com.practice.mybatis.repository.verifyjsonconvert.typehandler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.practice.mybatis.util.JSON;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author Luo Bao Ding
 * @since 2019/12/11
 */
@MappedTypes({Map.class})
@MappedJdbcTypes(value = {JdbcType.VARCHAR, JdbcType.LONGVARCHAR}, includeNullJdbcType = false)
public class JsonMapTypeHandler<T> extends BaseTypeHandler<Map<String, T>> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Map<String, T> parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.stringify(parameter));
    }

    @Override
    public Map<String, T> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return JSON.parseCollection(rs.getString(columnName), new TypeReference<Map<String, T>>() {
        });
    }

    @Override
    public Map<String, T> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return JSON.parseCollection(rs.getString(columnIndex), new TypeReference<Map<String, T>>() {
        });
    }

    @Override
    public Map<String, T> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return JSON.parseCollection(cs.getString(columnIndex), new TypeReference<Map<String, T>>() {
        });
    }
}
