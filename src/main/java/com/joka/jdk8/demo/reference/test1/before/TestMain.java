package com.joka.jdk8.demo.reference.test1.before;

import com.joka.jdk8.demo.reference.Apple;

import java.util.List;

/**
 * Created on 2019/8/24 23:46.
 *
 * @author zhaozengjie
 * Description :
 */
public class TestMain {

    public static void main(String[] args) {

        List<Apple> appleList = Apple.createAppleList();

        List<Apple> greenApples = Filter.filterGreenApple(appleList);

        System.out.println("Green Size is :" + greenApples.size());

        List<Apple> bigApples = Filter.filterBigApple(appleList);

        System.out.println("Big Apple Size is :" + bigApples.size());

    }
}
