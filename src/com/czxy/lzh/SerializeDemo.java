package com.czxy.lzh;

import java.io.*;

public class SerializeDemo
{
    public static void writeObject() {
        SendMail mail =  new SendMail();
        mail.name = "小明";
        mail.age  = 18;
        mail.address = "广州市";
        try {
            FileOutputStream fileOut = new FileOutputStream("/home/luanxu/Desktop/sendmail.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(mail);
            out.close();
            fileOut.close();
            System.out.println("保存成功");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObject() {
        
    }
}
