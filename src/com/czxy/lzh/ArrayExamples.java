package com.czxy.lzh;

import java.util.*;

public class ArrayExamples {
    public static void arrayList(){
        String [] a = { "A","B","C"};
        String [] b = { "D","E","F"};
        List list = new ArrayList<String >(Arrays.asList(a));
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
    public static void arrayExtended(){
        String [] names = new String[] {"A","B","C"};
        String [] extended = new String[5];
        extended[3] = "D";
        extended[4]  = "E";
        System.arraycopy(names,0,extended,0,names.length);
        System.out.println(Arrays.toString(extended));
    }
    public static void findRepeatItem(){
        String [] names = new String[]{"A","B","C","B","D","E","F","A"};
        for (int i = 0; i <names.length-1 ; i++) {
            for (int j = i+1; j <names.length ; j++) {
                if((names[i]==names[j])&&(i!=j)){
                    System.out.println("重复值"+names[i]);
                }
            }
        }
    }
    public static void unsetArrayItem(){
        String [] names = new String[]{"乱序","萌萌哒","BCD"};
        List<String> nameList = new ArrayList<String>(Arrays.asList(names));
        //以值删除
        nameList.remove("乱序");
        //以下表删除
        nameList.remove(0);
        System.out.println(nameList.toString());
    }
    public static void calcArrayRetain(){
        String [] names = new String[]{"乱序","萌萌哒","BCD"};
        String [] names2 = new String[]{"乱序","萌萌哒"};
        List namesList = new ArrayList<String>(Arrays.asList(names));
        List namesList2 = new ArrayList<String>(Arrays.asList(names2));
        namesList.retainAll(namesList2);
        System.out.println(namesList.toString());
    }
    public static void calcArrayDiff(){
        String [] names = new String[]{"乱序","萌萌哒","BCD"};
        String [] names2 = new String[]{"乱序","萌萌哒"};
        List namesList = new ArrayList<String>(Arrays.asList(names));
        List namesList2 = new ArrayList<String>(Arrays.asList(names2));
        namesList.removeAll(namesList2);
        System.out.println(namesList.toString());
    }
    public static void findArrayItem(){
        String [] names = new String[]{"乱序","萌萌哒","BCD"};
        List<String> namesList = Arrays.asList(names);
        String key = "乱序";
        if(namesList.contains(key)){
            System.out.println("包含"+key);
        }
    }
    public static void ifArrayEqual(){
        String [] names = new String[]{"乱序","萌萌哒","BCD"};
        String [] names2 = new String[]{"乱序","萌萌哒"};
        System.out.println(Arrays.equals(names,names2));
    }
    public static void arrayUnion(){
        Set<String> myset = new HashSet<String>();
        String [] names = new String[]{"乱序","BCD"};
        String [] names2 = new String[]{"乱序","萌萌哒"};
        for (String x:names) {
            myset.add(x);
        }
        for(String x:names2){
            myset.add(x);
        }
        String [] result = new String[]{};
        result = myset.toArray(result);
        System.out.println(Arrays.toString(result));
    }
}
