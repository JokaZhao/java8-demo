package com.joka.jdk8.demo.patterns.strategy.before;

import com.joka.jdk8.demo.patterns.strategy.ValidationStategy;

/**
 * Created on 2019/9/10 19:53.
 *
 * @author zhaozengjie
 * Description : 小写验证
 */
public class IsAllLowerCase implements ValidationStategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
