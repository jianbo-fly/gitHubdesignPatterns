package com.example.designpatterns.builder.pattren;

/**
 * 用途: 测试类
 *
 * @author: tangjianbo
 * @create: 2022/12/29 17:26
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal prepareNonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("prepareNonVegMeal");
        float price = prepareNonVegMeal.getPrice();
        System.out.println(price);
        prepareNonVegMeal.showItem();

        System.out.println("prepareVegMeal");
        Meal prepareVegMeal = mealBuilder.prepareVegMeal();
        System.out.println(prepareVegMeal.getPrice());
        prepareVegMeal.showItem();
    }
}
