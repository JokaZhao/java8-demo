package com.joka.jdk8.demo.lambda.test1;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created on 2019/8/25 23:17.
 *
 * @author zhaozengjie
 * Description :
 */
public class Case {

    //这里通过函数式编程的方式传入了不同行为
    public static void main(String[] args) throws IOException {

        String oneLine = FileUtils.processFile((BufferedReader br) -> br.readLine());

        String twoLine = FileUtils.processFile((BufferedReader br) -> br.readLine() + br.readLine());

    }
}
