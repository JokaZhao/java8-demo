package com.joka.jdk8.demo.patterns.strategy;

import com.joka.jdk8.demo.patterns.strategy.before.IsAllLowerCase;
import com.joka.jdk8.demo.patterns.strategy.before.IsNumeric;

/**
 * Created on 2019/9/10 19:55.
 *
 * @author zhaozengjie
 *
 */
public class ValidatorWithJava8 {

    private final ValidationStategy stategy;

    public ValidatorWithJava8(ValidationStategy v){
        this.stategy = v;
    }


    public boolean validate(String s ){
        return stategy.execute(s);
    }

    // 这是在java8实现策略模式的方法
    public static void main(String[] args) {
        ValidatorWithJava8 numVal = new ValidatorWithJava8(s -> s.matches("[a-z]+"));
        boolean b1 = numVal.validate("aaa");

        ValidatorWithJava8 lowVal = new ValidatorWithJava8(s -> s.matches("\\d+"));
        boolean b2 = lowVal.validate("aaa");
    }
}
