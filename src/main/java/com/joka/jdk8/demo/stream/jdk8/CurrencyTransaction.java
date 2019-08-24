package com.joka.jdk8.demo.stream.jdk8;

import com.joka.jdk8.demo.stream.common.Currency;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created on 2019/8/25 0:14.
 *
 * @author zhaozengjie
 * Description : jdk8中使用stream的写法
 */
public class CurrencyTransaction {

    public static Map<String, List<Currency>> transactionsByCCurreny(List<Currency> list, double limit) {

        Map<String, List<Currency>> result = list.stream()
                .filter((Currency c) -> c.getAmount() > limit)
                .collect(groupingBy(Currency::getCurrency));
        return result;
    }

}
