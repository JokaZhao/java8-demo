package com.joka.jdk8.demo.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2019/8/29 21:07.
 *
 * @author zhaozengjie
 * Description : 各种用法示例
 */
public class BaseCase {

    public static void main(String[] args) {

    }

    public static void map(){

        List<String> words = Arrays.asList("hello","222","11");

        List<Integer> collect = words.stream().map(String::length).collect(Collectors.toList());

        System.out.println(collect);

    }

    public static void sort(){

        List<Integer> words = Arrays.asList(5,4,1,6,7);

        List<Integer> collect = words.stream().sorted(Integer::compareTo).collect(Collectors.toList());

        System.out.println(collect);

    }

    public static void ship(){

        List<Integer> words = Arrays.asList(5,4,1,6,7);

        List<Integer> collect = words.stream().skip(2).collect(Collectors.toList());

        System.out.println(collect);

    }

    public static void filter(){

        List<Integer> words = Arrays.asList(5,4,1,6,7);

        List<Integer> collect = words.stream().filter(i -> i>2).collect(Collectors.toList());

        System.out.println(collect);
    }

    public static void distinct(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        List<Integer> collect = words.stream().distinct().collect(Collectors.toList());

        System.out.println(collect);

    }

    public static void limit(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        List<Integer> collect = words.stream().limit(3).collect(Collectors.toList());

        System.out.println(collect);

    }

    public static void foreach(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        words.stream().forEach(System.out::println);

    }

    public static void count(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        long count = words.stream().count();

        System.out.println(count);
    }


}
