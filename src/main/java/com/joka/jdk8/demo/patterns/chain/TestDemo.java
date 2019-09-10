package com.joka.jdk8.demo.patterns.chain;

import com.joka.jdk8.demo.patterns.chain.before.HeaderTextProcessing;
import com.joka.jdk8.demo.patterns.chain.before.SpellCheckerProcessing;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Created on 2019/9/10 22:55.
 *
 * @author zhaozengjie
 * Description : 责任链模式的比较
 */
public class TestDemo {

    public static void main(String[] args) {
        beforeJava8();
        inJava8();
    }

    public static void beforeJava8(){

        HeaderTextProcessing p1 = new HeaderTextProcessing();

        SpellCheckerProcessing p2 = new SpellCheckerProcessing();

        p1.setSuccessor(p2);

        String result = p1.handle("Aren't labdas really sexy?");

        System.out.println(result);
    }

    /**
     * 在Java8中可以使用以下写法
     */
    public static void inJava8(){

        UnaryOperator<String> headerProcessing = (String text) -> "From Raoul ,Mario And Alan :"+ text;
        UnaryOperator<String> spellCheckerProcssing = (String input) -> input.replaceAll("labda","lambda");

        Function<String,String> pipeline = headerProcessing.andThen(spellCheckerProcssing);

        String result = pipeline.apply("Aren't labdas really sexy?");

        System.out.println(result);

    }
}
