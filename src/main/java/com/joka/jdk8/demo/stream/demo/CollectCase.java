package com.joka.jdk8.demo.stream.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created on 2019/8/31 11:29.
 *
 * @author zhaozengjie
 * Description : 汇总收集Case
 */
public class CollectCase {

    public static void main(String[] args) {

        min();

        max();

    }

    /**
     * 下面两种用法是一样的
     */
    public static void count(){

        List<Integer> li = Arrays.asList(1, 2, 3, 4);

        long count = li.stream().count();

        Long collect2 = li.stream().collect(Collectors.counting());

        System.out.println(count);
        System.out.println(collect2);
    }

    public static void max(){

        List<Integer> li = Arrays.asList(1, 2, 3, 4);

        Optional<Integer> max1 = li.stream().reduce(Integer::max);

        Optional<Integer> max2 = li.stream().collect(Collectors.maxBy(Comparator.comparing(integer -> integer)));

        System.out.println(max1);
        System.out.println(max2);
    }

    public static void min(){

        List<Integer> li = Arrays.asList(1, 2, 3, 4);

        Optional<Integer> min1 = li.stream().reduce(Integer::min);

        Optional<Integer> min2 = li.stream().collect(Collectors.minBy(Comparator.comparing(Integer::intValue)));

        System.out.println(min1);
        System.out.println(min2);
    }

    /**
     * 汇总
     */
    public static void sumInt(){

        List<Integer> li = Arrays.asList(1, 2, 3, 4);

        Integer collect = li.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(collect);
    }

    /**
     * 求平均值
     */
    public static void average(){

        List<Integer> li = Arrays.asList(1, 2, 3, 4);

        Double collect = li.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(collect);

    }

    /**
     * 拼接字符串
     */
    public static void joinString(){

        List<String> strings = Arrays.asList("Hello ", "World");

        String joinStr = strings.stream().collect(Collectors.joining());

        System.out.println(joinStr);

    }

}
