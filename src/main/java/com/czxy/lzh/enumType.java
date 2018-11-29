package com.czxy.lzh;

public class enumType {
    enum Car {
        兰博基尼,雪佛兰
    }
    public static String getCar(){
        String cat = Car.兰博基尼.toString();
        return cat;
    }
}

