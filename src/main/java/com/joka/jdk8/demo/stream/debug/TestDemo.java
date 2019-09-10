package com.joka.jdk8.demo.stream.debug;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2019/9/10 23:20.
 *
 * @author zhaozengjie
 * Description : 在lambda中，是非常难调试的，所以日志调试显得很重要
 * 使用peek命令可以在操作之前执行某个步骤，这里是加了打印日志
 */
public class TestDemo {

    public static void main(String[] args) {
        noDebug();
        debug();
    }

    public static void noDebug(){

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream()
                .map(x -> x+17)
                .filter(x -> x%2 == 0)
                .limit(3)
                .forEach(System.out::println);

    }

    public static void debug(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream()
                .peek(x -> System.out.println("from stream : "+x))
                .map(x -> x+17)
                .peek(x-> System.out.println("after map: "+x))
                .filter(x -> x%2==0)
                .peek(x -> System.out.println("after filter: "+x))
                .limit(3)
                .peek(x -> System.out.println("after limit: "+x))
                .forEach(System.out::println);

    }


}
