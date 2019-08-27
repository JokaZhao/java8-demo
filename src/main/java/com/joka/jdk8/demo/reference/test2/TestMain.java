package com.joka.jdk8.demo.reference.test2;

import com.joka.jdk8.demo.reference.Apple;

import java.util.List;

/**
 * Created on 2019/8/25 22:34.
 *
 * @author zhaozengjie
 * Description : 用于模拟策略模式格式化输出
 */
public class TestMain {

    public static void main(String[] args) {
        testBeforeJava8();
    }

    /**
     * 通过声明不同的实现方法，来实现策略模式，每次调用都需要生成一个新的对象
     */
    public static void testBeforeJava8(){

        List<Apple> appleList = Apple.createAppleList();
        prettyPrintApple(appleList,new AppleFancyFormatter());
        prettyPrintApple(appleList,new AppleSimpleFormatter());

    }

    /**
     * 通过使用Lambda来实现策略模式
     */
    public static void testWithJava8(){


        List<Apple> appleList = Apple.createAppleList();

        prettyPrintApple(appleList,apple -> {
            String desc = apple.getWeight() > 150 ? "heavy" : "light";
            return "A "+ desc + " " + apple.getColor() + " apple";
        });

        prettyPrintApple(appleList,apple ->  "An apple of "+ apple.getWeight() + "g");

    }

    /**
     * 实现了基于策略模式格式化输出，在JDK8之前要实现，就需要在方法中定义一个策略接口，通过传入的对象不同来实现
     * 请看testBeforeJava8 与 testWithJava8 方法的实现对比
     * @param appleList
     * @param formatter
     */
    public static void prettyPrintApple(List<Apple> appleList ,AppleFormatter formatter){

        for (Apple apple : appleList) {
            String accept = formatter.accept(apple);
            System.out.println(accept);
        }
    }


}
