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
@MapperScan("com.practice.mybatis.dao")
public class MyBatisPracticeApplication implements CommandLineRunner {

    private WomanMapper womanMapper;

    public MyBatisPracticeApplication(WomanMapper womanMapper) {
        this.womanMapper = womanMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPracticeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Woman woman=new Woman();
        woman.setAge(17);
        woman.setHeight(180);
        woman.setName("Lily");

        womanMapper.insert(woman);
    }
}
