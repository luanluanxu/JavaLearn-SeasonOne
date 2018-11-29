package com.czxy.lzh;

import java.io.Serializable;

public class SendMail implements Serializable {
    public String name;
    public String address;
    public int age;
    public void send() {
        System.out.println("mail is send to "+name+age+" who live in "+address);
    }
}
