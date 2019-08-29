package com.joka.jdk8.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created on 2019/8/29 23:27.
 *
 * @author zhaozengjie
 * Description : 归约操作,对流的对象进行结合，得到一个新的值
 */
public class ReduceCase {

    public static void main(String[] args) {

        sum();

        max();

        min();

    }

    public static void sum(){

        List<Integer> list = Arrays.asList(1,2,3,4);

        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);

        System.out.println(reduce);

    }

    public static void max(){

        List<Integer> list = Arrays.asList(1,2,3,4);

        Optional<Integer> reduce = list.stream().reduce(Integer::max);

        reduce.ifPresent(System.out::println);

    }

    public static void min(){

        List<Integer> list = Arrays.asList(1,2,3,4);

        Optional<Integer> reduce = list.stream().reduce(Integer::min);

        reduce.ifPresent(System.out::println);

    }

}
