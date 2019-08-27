package com.joka.jdk8.demo.reference.test3;


import com.joka.jdk8.demo.reference.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created on 2019/8/27 23:28.
 *
 * @author zhaozengjie
 * Description : 展示构造方法引用
 */
public class TestMain {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(7,5,3,8);
        List<Apple> map = map(ints, Apple::new);
    }

    public static List<Apple> map(List<Integer> list , Function<Integer,Apple> f){

        List<Apple> result = new ArrayList<>();

        for (Integer e : list) {
            result.add(f.apply(e));
        }

        return result;

    }
}
