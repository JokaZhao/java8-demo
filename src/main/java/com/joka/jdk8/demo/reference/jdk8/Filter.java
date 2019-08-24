package com.joka.jdk8.demo.reference.jdk8;

import com.joka.jdk8.demo.reference.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/8/24 23:48.
 *
 * @author zhaozengjie
 * Description : jdk8 中的用法，:: 双冒号是可以将方法作为参数值传递给方法使用
 */
public class Filter {


    /**
     * 这里可以观察到，Predicate这个接口没有具体的实现类。
     * 通过::写法，可以将方法作为值传递过来，而接口可以使用传递过来的方法
     */
    public static List<Apple> filterApple(List<Apple> appleList, Predicate<Apple> p) {

        List<Apple> result = new ArrayList<Apple>();

        for (Apple apple : appleList) {
            if (p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
