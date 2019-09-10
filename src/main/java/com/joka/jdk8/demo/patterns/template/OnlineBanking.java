package com.joka.jdk8.demo.patterns.template;


/**
 * Created on 2019/9/10 20:00.
 *
 * @author zhaozengjie
 * Description : 模板方法
 */
public abstract class OnlineBanking {

    //在java8之前的使用,通过抽象的make方法来实现差异化
    public void process(int id){

        doSomething();

        make();

    }

    private void doSomething(){

        System.out.println("something happen");

    }

    abstract void make();


}
