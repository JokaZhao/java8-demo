package com.joka.jdk8.demo.patterns.factory.before;

import com.joka.jdk8.demo.patterns.factory.Product;

/**
 * Created on 2019/9/10 23:06.
 *
 * @author zhaozengjie
 * Description : 工厂模式
 */
public class ProductFactory {

    public static Product createProduct(String name){

        switch (name){
            case "loan":return new Loan();
            case "stock":return new Stock();
            case "bond": return new Bond();
            default:throw new RuntimeException("not such produt");
        }
    }



}
