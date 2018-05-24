package com.czxy.lzh;

import java.util.HashMap;
import java.util.Map;

public class MapType {
    private static Map  m1 = new HashMap();

    public static Map getM1() {
        return m1;
    }
    public static void getM1(String name){
        System.out.println(m1.get(name));
    }

    public static void pushM1(String name){
        m1.put("name",name);
    }
}
