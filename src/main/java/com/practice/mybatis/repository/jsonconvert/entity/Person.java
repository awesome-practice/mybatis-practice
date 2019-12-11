package com.practice.mybatis.repository.jsonconvert.entity;

import com.practice.mybatis.repository.jsonconvert.element.SoftwareOuput;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Person {
    private Long id;

    private List<String> hobbys;

    private List<SoftwareOuput> softwareOuputs;

    private Map<String, String> contactMap;


}
