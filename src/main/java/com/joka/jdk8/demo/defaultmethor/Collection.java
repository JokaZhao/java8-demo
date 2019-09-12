package com.joka.jdk8.demo.defaultmethor;

import com.joka.jdk8.demo.reference.test1.jdk8.Predicate;

import java.util.Iterator;

/**
 * Created on 2019/9/12 23:09.
 *
 * @author zhaozengjie
 * Description :  默认方法可以在不修改实现的情况下实现增加接口
 */
public interface Collection<E> extends java.util.Collection {


    /**
     * 拥有自定义方法删除
     * @param filter
     * @return
     */
    default boolean removeIf(Predicate<? super E> filter){

        boolean remove = false;

        Iterator<E> iterator = iterator();
        while (iterator.hasNext()){
            if (filter.test(iterator.next())){
                iterator.remove();
                remove =  true;
            }
        }

        return remove;
    }

}
