package com.joka.jdk8.demo.reference.test1.jdk8;

import com.joka.jdk8.demo.reference.Apple;

import java.util.List;

/**
 * Created on 2019/8/24 23:51.
 *
 * @author zhaozengjie
 * Description :
 */
public class TestMain {

    public static void main(String[] args) {

        List<Apple> appleList = Apple.createAppleList();

        //这里的Apple::isBigApple是基于匿名类来实现的，类似于new Predicate()
        List<Apple> bigApples = Filter.filterApple(appleList, Apple::isBigApple);

        System.out.println("Big Apple Size is :" + bigApples.size());

        List<Apple> greenApples = Filter.filterApple(appleList, Apple::isGreenApple);

        System.out.println("Green Size is :" + greenApples.size());

    }
}
