package com.example.designpatterns.filter.pattern;

import java.util.List;

/**
 * 用途: 过滤的标准接口
 *
 * @author: tangjianbo
 * @create: 2022/12/30 09:38
 */

public interface Criteria {
    /**
     *  创建标准接口
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
