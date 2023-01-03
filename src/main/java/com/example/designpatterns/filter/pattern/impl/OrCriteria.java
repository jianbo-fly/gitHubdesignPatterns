package com.example.designpatterns.filter.pattern.impl;

import com.example.designpatterns.filter.pattern.Criteria;
import com.example.designpatterns.filter.pattern.Person;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 用途: 两个过滤结果的并集
 *
 * @author: tangjianbo
 * @create: 2022/12/30 11:13
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = Stream.concat(criteria.meetCriteria(persons).stream(), otherCriteria.meetCriteria(persons).stream()).collect(
                Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(
                        Comparator.comparing(o -> (o.getName() + o.getGender() + o.getMaritalStatus()))
                        )
                ), ArrayList::new));
        return personList;
    }
}
