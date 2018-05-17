package com.czxy.lzh;

public class Statement {
    public static void WhileStatement(){
        int i = 0;
        while(i<10){
            System.out.println(i+"helloworld");
            i++;
        }
    }
    public static void doWhileStatement(){

        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<20);
    }
    public static void forStatement(){
        for(int i = 0; i<10; i++ ){
            System.out.println(i+"helloworld");
        }
    }
    public static void strengthenForStatement(){
        String [] names = {"john","marry","rose"};
        for(String x : names){
            System.out.println(x);
        }
    }
    public static void breakStatement(){
        String [] names = {"john","marry","rose"};
        for(String x : names){
            System.out.println(x);
            if(x == "marry"){
                System.out.println("I'm going out");
                break;
            }
        }
    }
    public static void ifStatement(){
        for (int i =5; i<=10;i++){
            if(i==8){
                System.out.println("哈哈");
            }else if(i==9){
                System.out.println("嘿嘿");
            }else {
                System.out.println(i);
            }
        }
    }
    public static void ifNestStatment(){
        int a  = 0;
        if(a==0){
            a++;
            if(a==1){
                System.out.println("嘿嘿");
            }
        }
    }
    public static void switchStatement(){
        String name = "乱序";
        switch (name){
            case "乱序": {
                System.out.println(name);
                break;
            }
            default: {
                System.out.println("你不是乱序");
            }
        }
    }

}
