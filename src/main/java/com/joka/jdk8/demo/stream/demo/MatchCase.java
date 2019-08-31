package com.joka.jdk8.demo.stream.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2019/8/29 21:16.
 *
 * @author zhaozengjie
 * Description : stream 的匹配与查找
 *
 */
public class MatchCase {

    public static void main(String[] args) {

    }

    public static void allMatch(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        if (words.stream().allMatch(integer -> integer>0)){

            System.out.println("All number large than zero");

        }

    }

    public static void anyMatch(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        if (words.stream().anyMatch(integer -> integer>6)){

            System.out.println("Some number large than 6");

        }

    }
    public static void noneMatch(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        if (words.stream().noneMatch(integer -> integer>7)){

            System.out.println("None number large than 7");

        }

    }

    //优先使用findAny，而不是findFirst，因为FindAny在并行的时候更有效率
    public static void findAny(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        words.stream().filter(i -> i==7).findAny().ifPresent(System.out::println);

    }

    public static void findFirst(){

        List<Integer> words = Arrays.asList(5,5,5,5,4,1,6,7);

        words.stream().filter(i -> i==5).findFirst().ifPresent(System.out::println);

    }
}
