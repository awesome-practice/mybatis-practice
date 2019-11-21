package com.practice.mybatis;

import com.practice.mybatis.dao.WomanMapper;
import com.practice.mybatis.model.Woman;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Luo Bao Ding
 * @since 2018/8/14
 */
@SpringBootApplication
@MapperScan({"com.practice.mybatis.repository.sakila"})
public class MyBatisPracticeApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyBatisPracticeApplication.class, args);
    }


}
