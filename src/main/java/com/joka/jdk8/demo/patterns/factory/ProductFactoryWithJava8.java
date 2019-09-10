package com.joka.jdk8.demo.patterns.factory;

import com.joka.jdk8.demo.patterns.factory.before.Bond;
import com.joka.jdk8.demo.patterns.factory.before.Loan;
import com.joka.jdk8.demo.patterns.factory.before.Stock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created on 2019/9/10 23:11.
 *
 * @author zhaozengjie
 * Description :
 */
public class ProductFactoryWithJava8 {

    final static Map<String, Supplier<Product>> map = new HashMap<>();

    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
        map.put("bond", Bond::new);
    }

    public static Product createProduct(String name){

        Supplier<Product> productSupplier = map.get(name);
        if (productSupplier!=null) {
            return productSupplier.get();
        }
        throw new RuntimeException("no such product");

    }

}
