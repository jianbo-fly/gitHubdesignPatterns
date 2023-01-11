package com.example.designpatterns.iterator.pattern.impl;

import com.example.designpatterns.iterator.pattern.Container;
import com.example.designpatterns.iterator.pattern.Iterator;

/**
 * 用途: 名字类型的仓库
 *
 * @author tangjianbo
 * @date 2023/01/09 10:38
 */
public class NameRepository implements Container {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
