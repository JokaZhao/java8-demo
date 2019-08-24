package com.joka.jdk8.demo.reference.jdk8;

/**
 * Created on 2019/8/24 23:47.
 *
 * @author zhaozengjie
 * Description : 用来过滤的接口
 */
public interface Predicate<T> {

    boolean test(T t);

}
