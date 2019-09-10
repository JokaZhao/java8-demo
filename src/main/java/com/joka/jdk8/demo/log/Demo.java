package com.joka.jdk8.demo.log;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created on 2019/9/10 19:39.
 *
 * @author zhaozengjie
 * Description :
 */
public class Demo {

    private static Logger logger = Logger.getLogger("Demo");

    /**
     * 这里有个问题
     * 1、将日志判断输出硬编码写在代码里面，会存在很多糟糕的代码
     */
    private static void beforeJava8(){

        if (logger.isLoggable(Level.INFO)){

            logger.info("Problem : xxx" );
        }
    }

    /**
     * 这里虽然将日志级别判断放进了方法里面，但是msg还是会编译，占用内存和CPU计算
     */
    private static void beforeJava8Two(){

        logger.log(Level.INFO,"Problem : xxx");

    }

    /**
     * 在Java8里面，支持传入Lambda表达式，在真实需要获取信息的时候，再去#get()信息，这样可以延迟实例化
     */
    private static void inJava8(){

        logger.log(Level.INFO,()-> "Problem : xxx");

    }


}
