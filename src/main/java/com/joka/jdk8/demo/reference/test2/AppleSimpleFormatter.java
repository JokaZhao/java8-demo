package com.joka.jdk8.demo.reference.test2;

import com.joka.jdk8.demo.reference.Apple;

/**
 * Created on 2019/8/25 22:34.
 *
 * @author zhaozengjie
 * Description :
 */
public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "An apple of "+ apple.getWeight() + "g";
    }
}
