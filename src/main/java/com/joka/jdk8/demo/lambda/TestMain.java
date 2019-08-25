package com.joka.jdk8.demo.lambda;

/**
 * Created on 2019/8/25 23:04.
 *
 * @author zhaozengjie
 * Description :
 */
public class TestMain {

    public static void main(String[] args) {



    }

    /**
     * java8之前的实现方式
     */
    public void testWithBefore(){
        //case 1
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };
    }

    /**
     * java 8 的实现方式
     */
    public void testWithJava8(){
        //case 1
        Runnable r = () -> System.out.println("Hello world");
    }

}
