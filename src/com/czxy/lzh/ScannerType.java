package com.czxy.lzh;
import java.util.Scanner;

public class ScannerType {
    public static void scannerDemo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收：");
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
