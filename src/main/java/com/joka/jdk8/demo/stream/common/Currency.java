package com.joka.jdk8.demo.stream.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/8/25 0:04.
 *
 * @author zhaozengjie
 * Description : 交易通过货币金额和货币种类来筛选
 */
@Data
@AllArgsConstructor
public class Currency {

    private double amount;

    private String currency;

    public static List<Currency> createList(){

        List<Currency> result = new ArrayList<>();

        result.add(new Currency(1,"CNY"));
        result.add(new Currency(1,"HKD"));

        result.add(new Currency(2.5,"CNY"));
        result.add(new Currency(2.5,"HKD"));

        return result;
    }

}
