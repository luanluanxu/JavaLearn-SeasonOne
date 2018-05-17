package com.czxy.lzh;

public class StringType {
    public static void charArrayString(){
        char [] helloArr = {'h','e','l','l','o','w','o','r','l','d'};
        String hello = new String(helloArr);
        System.out.println(hello);
    }
    public static void stringConcat(){
        String name1 = "hello";
        String name2 = "world";
        System.out.println(name1.concat(name2));
    }
    public static void stringFormat(){
        String name = "luanxu";
        int age = 20;
        String job = "programmer";
        System.out.printf("你的个人信息为  姓名：%s , 年龄 %s , 工作 %s",name,age,job);
    }

}
