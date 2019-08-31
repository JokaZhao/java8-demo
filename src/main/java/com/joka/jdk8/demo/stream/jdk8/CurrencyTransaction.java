package com.joka.jdk8.demo.stream.jdk8;

import com.joka.jdk8.demo.stream.common.Currency;

import java.util.ArrayList;
import java.util.HashMap;
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

    public static Map<String, List<Currency>> transactionsByCurrenyWithJava8(List<Currency> list, double limit) {

        //这里的stream是由接口的默认方法提供的
        Map<String, List<Currency>> result = list.stream()
                .filter((Currency c) -> c.getAmount() > limit)
                .collect(groupingBy(Currency::getCurrency));
        return result;
    }

    /**
     * 筛选金额大于指定金额的交易，并且按货币分
     *
     * @return
     */
    public static Map<String, List<Currency>> transactionsByCurrenyBeforeJava8(List<Currency> list, double limit) {

        Map<String, List<Currency>> result = new HashMap<>();

        for (Currency currency : list) {

            if (currency.getAmount() > limit) {
                String cny = currency.getCurrency();
                List<Currency> currencies = result.get(cny);
                if (currencies == null){
                    currencies = new ArrayList<>();
                    result.put(cny,currencies);
                }
                currencies.add(currency);
            }
        }
        return result;
    }
}
