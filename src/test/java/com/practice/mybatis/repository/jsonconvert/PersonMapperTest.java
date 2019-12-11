package com.practice.mybatis.repository.jsonconvert;

import com.practice.mybatis.repository.jsonconvert.entity.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

/**
 * @author Luo Bao Ding
 * @since 2019/12/11
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class PersonMapperTest {
    @Autowired
    PersonMapper personMapper;

    @Test
    void insertSelective() {

        Person record = new Person();
        record.setHobbys(Arrays.asList("sport", "creation", "music"));

        int changed = personMapper.insertSelective(record);
        Assertions.assertTrue(changed > 0);
    }

    @Test
    void selectByPrimaryKey() {
    }

    @Test
    void updateByPrimaryKeySelective() {
    }
}
