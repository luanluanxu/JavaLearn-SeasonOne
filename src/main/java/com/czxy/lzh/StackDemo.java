package com.czxy.lzh;

import java.util.Stack;

public class StackDemo {
    private static Stack<String> st = new Stack<String>();
    public static void main(){
        showpush(st,"乱序");
    }
    public static void showpush(Stack<String> st,String name){
        st.push(name);
        System.out.println("push:"+name);
        System.out.println("stack:"+st);
    }
    public static void showpush(String name){
        st.push(name);
        System.out.println("push:"+name);
        System.out.println("stack:"+st);
    }
    public static void showpop (Stack<String> st){
        System.out.println("pop ->"+st.pop());
    }

    public static void showpop (){
        System.out.println("pop ->"+st.pop());
    }
    public static void showStack(){
        System.out.println("stack:"+st);
    }
}
