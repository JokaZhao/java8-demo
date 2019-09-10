package com.joka.jdk8.demo.patterns.strategy;

import com.joka.jdk8.demo.patterns.strategy.before.IsAllLowerCase;
import com.joka.jdk8.demo.patterns.strategy.before.IsNumeric;

/**
 * Created on 2019/9/10 19:55.
 *
 * @author zhaozengjie
 *
 */
public class Validator {

    private final ValidationStategy stategy;

    public Validator(ValidationStategy v){
        this.stategy = v;
    }


    public boolean validate(String s ){
        return stategy.execute(s);
    }

    // 这是在java8之前实现策略模式的方法
    public static void main(String[] args) {
        Validator numVal = new Validator(new IsNumeric());
        boolean b1 = numVal.validate("aaa");

        Validator lowVal = new Validator(new IsAllLowerCase());
        boolean b2 = lowVal.validate("aaa");
    }
}
