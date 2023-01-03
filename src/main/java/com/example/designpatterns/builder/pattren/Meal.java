package com.example.designpatterns.builder.pattren;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用途: 套餐
 *
 * @author: tangjianbo
 * @create: 2022/12/29 17:07
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getPrice() {
        float sum = 0.0f;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }
    public void showItem() {
        items.forEach(e -> System.out.println("name:" + e.name() +
                "--packing: " + e.packing().pack() + "--price:" + e.price()));
    }
}
