package com.joka.jdk8.demo.patterns.strategy.before;

import com.joka.jdk8.demo.patterns.strategy.ValidationStategy;

/**
 * Created on 2019/9/10 19:54.
 *
 * @author zhaozengjie
 * Description : 数字校验
 */
public class IsNumeric implements ValidationStategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
