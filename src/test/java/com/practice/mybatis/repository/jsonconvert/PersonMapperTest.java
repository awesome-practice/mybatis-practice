package com.practice.mybatis.repository.jsonconvert;

import com.practice.mybatis.repository.jsonconvert.element.SoftwareOuput;
import com.practice.mybatis.repository.jsonconvert.entity.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.*;

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
        Map<String, String> map = new HashMap<>();
        map.put("father", "12327272141");
        map.put("mether", "12334213");
        record.setContactMap(map);
        List<SoftwareOuput> softwareOuputs = new ArrayList<>();
        softwareOuputs.add(SoftwareOuput.builder().softwareName("rednet").userCount(10).build());
        softwareOuputs.add(SoftwareOuput.builder().softwareName("tmcloud").userCount(120).build());
        record.setSoftwareOutputs(softwareOuputs);
        int changed = personMapper.insertSelective(record);
        Assertions.assertTrue(changed > 0);
    }

    @Test
    void selectByPrimaryKey() {
        Person person = personMapper.selectByPrimaryKey(3L);
        System.out.println("person = " + person);
    }

    @Test
    void updateByPrimaryKeySelective() {
    }
}
