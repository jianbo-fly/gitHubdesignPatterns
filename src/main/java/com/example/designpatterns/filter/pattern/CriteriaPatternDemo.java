package com.example.designpatterns.filter.pattern;

import com.example.designpatterns.filter.pattern.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途: 测试
 *
 * @author: tangjianbo
 * @create: 2022/12/30 11:24
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {

        String a = "1";
        String b = "2";
        System.out.println(a.compareTo(b));
        List<Person> persons = new ArrayList<>();
        persons.add(Person.builder().name("Robert").gender("MALE").maritalStatus("SINGLE").build());
        persons.add(Person.builder().name("John").gender("MALE").maritalStatus("MARRIED").build());
        persons.add(Person.builder().name("Laura").gender("FEMALE").maritalStatus("MARRIED").build());
        persons.add(Person.builder().name("Diana").gender("FEMALE").maritalStatus("SINGLE").build());
        persons.add(Person.builder().name("Mike").gender("MALE").maritalStatus("SINGLE").build());
        persons.add(Person.builder().name("Bobby").gender("MALE").maritalStatus("SINGLE").build());

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        List<Person> personList = singleOrFemale.meetCriteria(persons);
        printPersons(personList);


        System.out.println("--------------");
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
