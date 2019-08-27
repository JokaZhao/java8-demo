package com.joka.jdk8.demo.reference;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/8/24 23:33.
 *
 * @author zhaozengjie
 * Description : 苹果，里面有一些用来晒别的方法
 */
@Data
@AllArgsConstructor
public class Apple {

    public Apple(Integer i) {

        this.weight = i;
    }

    private String color;

    private int weight;

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isBigApple(Apple apple) {
        return 150 < apple.getWeight();
    }
    /**
     * 创建测试数据用
     */
    public static List<Apple> createAppleList(){

        List<Apple> list = new ArrayList<Apple>();

        list.add(new Apple("green",131));
        list.add(new Apple("green",151));
        list.add(new Apple("green",161));
        list.add(new Apple("green",121));

        list.add(new Apple("red",131));
        list.add(new Apple("red",151));
        list.add(new Apple("red",161));
        list.add(new Apple("red",121));

        return list;
    }

}
