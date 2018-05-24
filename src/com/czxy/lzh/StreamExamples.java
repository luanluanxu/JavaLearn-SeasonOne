package com.czxy.lzh;

import java.io.*;
import java.nio.charset.Charset;

public class StreamExamples {
    public static void readConsole(){
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        String c;
        try{
            do {
                c = br.readLine();
                System.out.println(c);
            } while(!c.equals("exit"));
        }catch (IOException e){
            System.out.println("error");
        }
    }
    public static void fileInputStream() throws IOException{
        InputStream file = new FileInputStream("C:/hello.txt")  ;
        int size = file.available();
        char [] reads = new char[size];
        for(int i=0; i< size; i++){
            reads[i] = (char)file.read();
        }
        String str = new String(reads);
        str = new String(str.getBytes("utf-8"),"utf-8");
        System.out.println(Charset.defaultCharset().name());
        System.out.println(str);
    }

    public static void bufferReader() throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("C:/hello.txt"));
        String str;
        while((str = in.readLine())!=null){
            System.out.println(str);
        }
            System.out.println("读取完毕");
    }

    public static void bufferWriter() throws IOException{
        BufferedWriter out = new BufferedWriter(new FileWriter("C:/hello.txt"));
        out.write("java io测试");
        out.close();
    }


}
