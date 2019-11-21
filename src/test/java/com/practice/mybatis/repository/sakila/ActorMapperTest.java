package com.practice.mybatis.repository.sakila;


import com.practice.mybatis.ao.QueryRequest;
import com.practice.mybatis.repository.sakila.entity.Actor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @author Luo Bao Ding
 * @since 2019/11/21
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ActorMapperTest {
    @Autowired
    private ActorMapper actorMapper;


    @Test
    void selectAll() {
        List<Actor> actors = actorMapper.selectAll();
        System.out.println("actors = " + actors);

    }
      @Test
    void selectAllShard() {
        List<Actor> actors = actorMapper.selectAllShard(new QueryRequest());
        System.out.println("actors = " + actors);

    }
      @Test
    void selectAllShard1() {
        List<Actor> actors = actorMapper.selectAllShard1(new QueryRequest());
        System.out.println("actors = " + actors);

    }

    @Test
    void selectAllShard2() {
        List<Actor> actors = actorMapper.selectAllShard2(new QueryRequest());
        System.out.println("actors = " + actors);

    }
    @Test
    void selectAllShard3() {
        List<Actor> actors = actorMapper.selectAllShard3(new QueryRequest());
        System.out.println("actors = " + actors);

    }


}
