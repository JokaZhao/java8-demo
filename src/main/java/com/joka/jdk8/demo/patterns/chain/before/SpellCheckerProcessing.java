package com.joka.jdk8.demo.patterns.chain.before;

import com.joka.jdk8.demo.patterns.chain.ProcessingObject;

/**
 * Created on 2019/9/10 22:54.
 *
 * @author zhaozengjie
 * Description :
 */
public class SpellCheckerProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String input) {
        return input.replaceAll("labda","lambda");
    }
}
