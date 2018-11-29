package com.czxy.lzh;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class dateType {
    public static void dateDemo(){
        Date myDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = ft.format(myDate);
        System.out.println(nowTime);
    }
    public static void stringToTime(){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2017-03-05 00:05:10";
        try{
            System.out.println(ft.format(ft.parse(time)));
        }
        catch (ParseException e){
            System.out.println("error");
        }
    }
    public static void calendarType(){
        Calendar myCale = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        myCale.set(2018,5,17,24,53,33);
        myCale.set(Calendar.YEAR,2009);
        myCale.add(Calendar.YEAR,9);
            System.out.println(myCale.get(Calendar.YEAR));
    }
    public static void GregorianCalendarDemo(){
        String [] months = new String[]
                {"一月","二月","三月","四月",
                "五月","六月","七月","八月",
                "九月","十月","十一月","十二月"};
        GregorianCalendar gcalendar = new GregorianCalendar();
        gcalendar.set(2018,1,17,24,53,33);
        System.out.println(months[gcalendar.get(Calendar.MONTH)-1]);
    }
    public static void timestampsToDate(){
        Long timeStamp = System.currentTimeMillis();
        System.out.println(timeStamp);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(timeStamp));
    }

}
