package com.example.designpatterns.filter.pattern.impl;

import com.example.designpatterns.filter.pattern.Criteria;
import com.example.designpatterns.filter.pattern.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用途: 过滤出女性
 *
 * @author: tangjianbo
 * @create: 2022/12/30 09:50
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> "FEMALE".equals(person.getGender())).collect(Collectors.toList());
    }
}
