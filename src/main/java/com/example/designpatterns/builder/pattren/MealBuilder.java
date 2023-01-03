package com.example.designpatterns.builder.pattren;

import com.example.designpatterns.builder.pattren.impl.ChickenBurger;
import com.example.designpatterns.builder.pattren.impl.Coke;
import com.example.designpatterns.builder.pattren.impl.Pepsi;
import com.example.designpatterns.builder.pattren.impl.VegBurger;

/**
 * 用途: TODO
 *
 * @author: tangjianbo
 * @create: 2022/12/29 17:18
 */
public class MealBuilder {
    /**
     * 准备素食套餐
     *
     * @return meal
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 准备非素食套餐
     *
     * @return meal
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
