package com.joka.jdk8.demo.lambda.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created on 2019/8/25 23:14.
 *
 * @author zhaozengjie
 * Description : 步骤二，定义所需要的行为
 */
public class FileUtils {

    //这里的例子是读取文件后，所需要的动作由方法传入
    public static String processFile(BufferdReaderProcessor processor) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return processor.process(br);
        }
    }
}
