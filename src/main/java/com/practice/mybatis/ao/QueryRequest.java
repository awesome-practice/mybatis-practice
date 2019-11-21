package com.practice.mybatis.ao;

import com.practice.mybatis.util.TableShard;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Transient;

/**
 * @author Luo Bao Ding
 * @since 2019/11/21
 */
@Getter
@Setter
public class QueryRequest {
    @Transient
    private TableShard tableShard=new TableShard();

    private String index = "or";

}
