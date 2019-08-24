package com.joka.jdk8.demo.stream.before;

import com.joka.jdk8.demo.stream.common.Currency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2019/8/25 0:08.
 *
 * @author zhaozengjie
 * Description :
 */
public class CurrencyTransaction {

    /**
     * 筛选金额大于指定金额的交易，并且按货币分
     *
     * @return
     */
    public static Map<String, List<Currency>> transactionsByCCurreny(List<Currency> list, double limit) {

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
