package com.example.designpatterns.iterator.pattern;

import com.example.designpatterns.iterator.pattern.impl.NameRepository;

/**
 * 用途: 测试
 *
 * @author tangjianbo
 * @date 2023/01/09 10:47
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
