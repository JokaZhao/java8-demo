package com.joka.jdk8.demo.lambda.test1;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created on 2019/8/25 23:13.
 *
 * @author zhaozengjie
 * Description : 步骤1，定义一个过程接口
 * @FunctionalInterface 用来标记一个函数式接口，有点类似于@Override，只是一种规范
 */
@FunctionalInterface
public interface BufferdReaderProcessor {

    String process(BufferedReader b) throws IOException;

}
