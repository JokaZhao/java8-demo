package com.joka.jdk8.demo.patterns.template;

import java.util.function.Consumer;

/**
 * Created on 2019/9/10 20:00.
 *
 * @author zhaozengjie
 * Description : 模板方法
 */
public class OnlineBankingWithJava8 {


    private void doSomething(){

        System.out.println("something happen");

    }

    //这是在Java8中的使用，可以通过Lambda来简化过程
    public void processWithJava8(int id , Consumer<Integer> consumer){

        doSomething();

        consumer.accept(id);

    }

    public static void main(String[] args) {
        new OnlineBankingWithJava8().processWithJava8(11,(Integer i)-> System.out.println("ss"));
    }

}
