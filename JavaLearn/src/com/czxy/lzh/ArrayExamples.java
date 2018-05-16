package com.czxy.lzh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExamples {
    public static void arrayList(){
        String [] a = { "A","B","C"};
        String [] b = { "D","E","F"};
        List list = new ArrayList<String>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
    public static void arrayFill(){
        int [] array  = new int[6];
        Arrays.fill(array,100);
        System.out.println(Arrays.toString(array));
        System.out.println();
        Arrays.fill(array,3,6,123);
        System.out.println(Arrays.toString(array));
    }
}
