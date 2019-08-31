package com.joka.jdk8.demo.stream.demo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created on 2019/8/29 23:37.
 *
 * @author zhaozengjie
 * Description : stream的参考例子
 */
public class StreamCase {

    public static void main(String[] args) throws IOException {
        fileToStream();
    }

    public static void valueToStream(){

        Stream<String> s = Stream.of("s", "2", "sss");

        s.map(String::toUpperCase).forEach(System.out::println);

    }

    public static void arraysToStream(){

        int[] nums = {2,3,13,44,23};

        int sum = Arrays.stream(nums).sum();

        System.out.println(sum);

    }

    public static void fileToStream() throws IOException {

        Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset());

        //使用flatMap将多个line的流合成一个流
        long count = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                .distinct()
                .count();

        //输出单词个数
        System.out.println(count);

    }

    /**
     * 无限流
     * 一般需要接受一个limit来避免无穷执行下去
     */
    public static void unlimitedStream(){

        //依次对每个新生成的值应用函数
        Stream.iterate(0,n -> n+2)
                .limit(10)
                .forEach(System.out::println);

        //提供新的值
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

    }

}
