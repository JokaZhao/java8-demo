package com.joka.jdk8.demo.stream.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2019/8/31 12:45.
 *
 * @author zhaozengjie
 * Description : 晚餐
 */
@Data
@AllArgsConstructor
public class Dish {

    private String name;

    private String type;//类型

    private Integer colories;//卡路里

    @Override
    public String toString(){
        return name;
    }

    public static List<Dish> createData(){

        return Arrays.asList(
                new Dish("prawns","FISH",100),
                new Dish("salmon","FISH",150),
                new Dish("port","MEAT",150),
                new Dish("beef","MEAT",250),
                new Dish("chicken","MEAT",150),
                new Dish("french fries","OTHER",150),
                new Dish("rice","OTHER",430),
                new Dish("season fruit","OTHER",350),
                new Dish("pizza","OTHER",600)
        );
    }

}
