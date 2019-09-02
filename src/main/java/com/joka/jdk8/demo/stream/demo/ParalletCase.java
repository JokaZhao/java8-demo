package com.joka.jdk8.demo.stream.demo;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created on 2019/9/2 23:05.
 *
 * @author zhaozengjie
 * Description : 并行流
 */
public class ParalletCase {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        beforeJava8();

        long end = System.currentTimeMillis();

        System.out.println("cost :"+(end-start));

        long start2 = System.currentTimeMillis();

        inJava8();

        long end2 = System.currentTimeMillis();

        System.out.println("cost2 :"+(end2-start2));

        long start3 = System.currentTimeMillis();

        parallel();

        long end3 = System.currentTimeMillis();

        System.out.println("cost3 :"+(end3-start3));

    }

    public static void beforeJava8(){
        Long max = (long) Integer.MAX_VALUE;
        long result = 0;
        for (Long i = 0L; i < max; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static void inJava8(){

        Long result = Stream.iterate(1L, i -> i + 1)
                .limit(Integer.MAX_VALUE)
                .reduce(0L, Long::sum);

        System.out.println(result);

    }

    public static void parallel(){
        long result = LongStream.range(0, Integer.MAX_VALUE).parallel().reduce(0, Long::sum);
        System.out.println(result);
    }
}
