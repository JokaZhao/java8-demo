package com.joka.jdk8.demo.patterns.chain.before;

import com.joka.jdk8.demo.patterns.chain.ProcessingObject;

/**
 * Created on 2019/9/10 22:53.
 *
 * @author zhaozengjie
 * Description :
 */
public class HeaderTextProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String input) {
        return "From Raoul ,Mario And Alan :"+ input;
    }
}
