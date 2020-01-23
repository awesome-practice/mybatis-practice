package com.practice.mybatis.controller;

import com.practice.mybatis.repository.sakila.ActorMapper;
import com.practice.mybatis.repository.sakila.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SakilaController {

    private final ActorMapper actorMapper;

    public SakilaController(ActorMapper actorMapper) {
        this.actorMapper = actorMapper;
    }


    @RequestMapping("/list")
    public List<Actor> list() {
        List<Actor> actors = actorMapper.selectAll();
        System.out.println("actors = " + actors);
        return actors;
    }

}
