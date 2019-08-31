package com.joka.jdk8.demo.stream.demo;

import com.joka.jdk8.demo.stream.common.CaloricLevel;
import com.joka.jdk8.demo.stream.common.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created on 2019/8/31 12:44.
 *
 * @author zhaozengjie
 * Description : 分组Case
 */
public class GroupbyCase {

    public static void main(String[] args) {

        simpleGroupBy();
        customGroupBy();
        multiGroup();
    }

    /**
     * 基本分组
     */
    public static void simpleGroupBy(){

        List<Dish> data = Dish.createData();

        Map<String, List<Dish>> collect = data.stream().collect(Collectors.groupingBy(Dish::getType));

        System.out.println(collect);

    }

    /**
     * 自定义分组
     */
    public static void customGroupBy(){

        List<Dish> data = Dish.createData();

        Map<CaloricLevel, List<Dish>> collect = data.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getColories() <= 200) return CaloricLevel.DIET;
            else if (dish.getColories() <= 550) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        }));

        System.out.println(collect);
    }

    /**
     * 二级分组
     */
    public static void multiGroup(){

        List<Dish> data = Dish.createData();

        Map<String, Map<CaloricLevel, List<Dish>>> collect = data.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(
                dish -> {
                    if (dish.getColories() <= 200) return CaloricLevel.DIET;
                    else if (dish.getColories() <= 550) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                }
        )));

        System.out.println(collect);
    }

    /**
     * 子组进行运算
     */
    public static void countSubGroup(){

        List<Dish> data = Dish.createData();

        Map<String, Long> collect = data.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));

        System.out.println(collect);

    }

}
