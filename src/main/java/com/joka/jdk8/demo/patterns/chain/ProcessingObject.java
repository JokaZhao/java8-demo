package com.joka.jdk8.demo.patterns.chain;

/**
 * Created on 2019/9/10 22:51.
 *
 * @author zhaozengjie
 * Description : 责任链模式
 */
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject successor) {
        this.successor = successor;
    }

    public T handle(T input){
        T t = handleWork(input);
        if (successor != null){
            return successor.handle(t);
        }
        return t;
    }

    abstract protected T handleWork(T input);
}
