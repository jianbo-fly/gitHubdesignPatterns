package com.example.designpatterns.filter.pattern.impl;

import com.example.designpatterns.filter.pattern.Criteria;
import com.example.designpatterns.filter.pattern.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用途: 过滤出男性
 *
 * @author: tangjianbo
 * @create: 2022/12/30 09:48
 */
public class CriteriaMale implements Criteria {
    /**
     *  过滤出男性
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> "MALE".equals(person.getGender())).collect(Collectors.toList());
    }
}
