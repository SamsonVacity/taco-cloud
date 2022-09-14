package com.tacocloud.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 成分对象
 */

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }

//    WRAP:包
//    PROTEIN:蛋白质
//    VEGGIES:蔬菜
//    CHEESE:奶酪
//    SAUCE:调味汁
}
