package com.czxy.lzh;

public class ArrayType {
    public static void arrayStatement(){
        String [] names = {"乱序","哈哈"};
    }
    public static void arraySum(){
        double [] numArr  = new double[10];
        numArr[0] = 5.6;
        numArr[1] = 4.5;
        numArr[2] = 3.3;
        numArr[3] = 13.2;
        numArr[4] = 4.0;
        numArr[5] = 34.33;
        numArr[6] = 34.0;
        numArr[7] = 45.45;
        numArr[8] = 99.993;
        numArr[9] = 11123;
        double result = 0;
        for (double x : numArr) {
            result+=x;
            if(x==numArr[numArr.length-1]){
                System.out.println("结果为:"+result);
            }
        }
    }
}
