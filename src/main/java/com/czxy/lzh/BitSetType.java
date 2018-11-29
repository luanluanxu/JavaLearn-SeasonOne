package com.czxy.lzh;

import java.util.BitSet;

public class BitSetType {
    private static BitSet bits1 = new BitSet();
    private static BitSet bits2 = new BitSet();
    public static void bitsset(){
        for (int i =0;i<16;i++){
            if(i%2==0){
                bits1.set(i);
            }
            if(i%5!=0){
                bits2.set(i);
            }
        }
        System.out.println("bits1:"+bits1);
        System.out.println("bits2:"+bits2);

    }
}
