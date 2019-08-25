package com.joka.jdk8.demo.reference.test2;

import com.joka.jdk8.demo.reference.Apple;

/**
 * Created on 2019/8/25 22:32.
 *
 * @author zhaozengjie
 * Description :
 */
public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String desc = apple.getWeight() > 150 ? "heavy" : "light";
        return "A "+ desc + " " + apple.getColor() + " apple";
    }
}
