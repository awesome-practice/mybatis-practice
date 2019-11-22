package com.practice.mybatis.repository.sakila;

import com.practice.mybatis.ao.QueryRequest;
import com.practice.mybatis.repository.sakila.entity.Actor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Luo Bao Ding
 * @since 2019/11/22
 */
@Component
public class ActorMapperProxy  implements ActorMapper  {

    private final ActorMapper actorMapper;

    public ActorMapperProxy(ActorMapper actorMapper) {
        this.actorMapper = actorMapper;
    }

    @Override
    public int deleteByPrimaryKey(Short actorId) {
        return 0;
    }

    @Override
    public int insert(Actor record) {
        return 0;
    }

    @Override
    public Actor selectByPrimaryKey(Short actorId) {
        return null;
    }

    @Override
    public List<Actor> selectAll() {
        return actorMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Actor record) {
        return 0;
    }

    @Override
    public List<Actor> selectAllShard(QueryRequest request) {
        return null;
    }

    @Override
    public List<Actor> selectAllShard1(QueryRequest request) {
        return null;
    }

    @Override
    public List<Actor> selectAllShard2(QueryRequest request) {
        return null;
    }

    @Override
    public List<Actor> selectAllShard3(QueryRequest request) {
        return null;
    }

    @Override
    public Actor selectByStrategy(QueryRequest request) {
        return null;
    }
}
