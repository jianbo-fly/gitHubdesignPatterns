package com.example.designpatterns.filter.pattern.impl;

import com.example.designpatterns.filter.pattern.Criteria;
import com.example.designpatterns.filter.pattern.Person;

import java.util.List;

/**
 * 用途: 两个过滤条件组合
 *
 * @author: tangjianbo
 * @create: 2022/12/30 11:07
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
    }
}
