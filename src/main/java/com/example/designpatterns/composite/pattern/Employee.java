package com.example.designpatterns.composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途:  Employee 类，该类带有 Employee 对象的列表
 *
 * @author: tangjianbo
 * @create: 2022/12/30 14:43
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    /**
     *  构造函数
     * @param name
     * @param dept
     * @param sal
     */
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
