package com.example.designpatterns.filter.pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 用途: 基础类
 *
 * @author: tangjianbo
 * @create: 2022/12/30 09:35
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;
}
