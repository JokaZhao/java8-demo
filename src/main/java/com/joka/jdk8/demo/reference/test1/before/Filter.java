package com.joka.jdk8.demo.reference.test1.before;

import com.joka.jdk8.demo.reference.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/8/24 23:40.
 *
 * @author zhaozengjie
 * Description : 过滤器，在Java8前是这么写的
 */
public class Filter {

    public static List<Apple> filterGreenApple(List<Apple> appleList){

        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : appleList) {

            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterBigApple(List<Apple> appleList){
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : appleList) {

            if (150 <= apple.getWeight()){
                result.add(apple);
            }
        }
        return result;
    }

}
