package com.czxy.lzh;

import java.io.Writer;

public class StringBufferClass {
    public static void stringBuffer(){
        StringBuffer mybuffer = new StringBuffer("乱序:");
        mybuffer.append("helloworld");
        mybuffer.insert(5,"haha");
        mybuffer.delete(5,9);
        mybuffer.replace(3,8,"");
        System.out.println(mybuffer);
    }
}
