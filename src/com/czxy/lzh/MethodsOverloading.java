package com.czxy.lzh;

public class MethodsOverloading {
    public static void getSomething(){
        System.out.println("你没有输入任何参数");
    }
    public static void getSomething(String names){
        System.out.println("你输入了一个参数，"+names);
    }
}
