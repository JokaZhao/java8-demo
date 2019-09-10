package com.joka.jdk8.demo.patterns.factory;

import com.joka.jdk8.demo.patterns.factory.before.ProductFactory;

/**
 * Created on 2019/9/10 23:10.
 *
 * @author zhaozengjie
 * Description : 工厂模式
 */
public class TestDemo {
    public static void main(String[] args) {

        beforeJava8();

        inJava8();
    }

    /**
     * Java8之前的写法
     */
    public static void beforeJava8(){

        Product loan = ProductFactory.createProduct("loan");

    }

    public static void inJava8(){

        Product loan = ProductFactoryWithJava8.createProduct("loan");

    }
}
