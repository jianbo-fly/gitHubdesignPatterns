package com.example.designpatterns.filter.pattern.impl;

import com.example.designpatterns.filter.pattern.Criteria;
import com.example.designpatterns.filter.pattern.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用途: 单身
 *
 * @author: tangjianbo
 * @create: 2022/12/30 11:02
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> "SINGLE".equals(person.getMaritalStatus())).collect(Collectors.toList());
    }
}
