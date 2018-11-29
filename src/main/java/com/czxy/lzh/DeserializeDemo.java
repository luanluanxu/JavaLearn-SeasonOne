package com.czxy.lzh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void readObject() {
        SendMail mail = null;
        try {
            FileInputStream fileIn = new FileInputStream("/home/luanxu/Desktop/sendmail.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mail = (SendMail) in.readObject();
            mail.send();
            in.close();
            fileIn.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            System.out.println("没有这个类可被反序列化");
        }
    }
}
