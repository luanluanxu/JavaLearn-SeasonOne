package com.czxy.lzh;

import java.util.Arrays;
import java.util.Vector;

public class VectorType {
    public static void vectorDemo(){
        // initial size is 10, increment is 2
        Vector v = new Vector(10,2);
        v.addElement(1);
        v.addElement(2);

        System.out.println(v+"下标"+v.indexOf(1)+"的值为"+v.get(v.indexOf(1)));
        System.out.println(Arrays.toString(v.toArray()));
    }

}
