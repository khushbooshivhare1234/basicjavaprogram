package Enum;

import java.util.Locale;

enum Days{
    monday,tuesday,wednesday,Thursday,FriDay,SATURADAY
}


public class Enumdemo {
    public static void main(String argv[]){
        Days d1=Days.FriDay;
        System.out.println(d1);
        for (Days d:Days.values()){
            System.out.println(d);
        }
        System.out.println(Days.valueOf("monday"));
        System.out.println(Days.valueOf("WednesDay".toLowerCase(Locale.ROOT)));
        System.out.println(Days.valueOf("saturaday".toUpperCase(Locale.ROOT)));
        System.out.println(Days.valueOf("tuesday").ordinal());
        System.out.println(Days.valueOf("Thursday").compareTo(Days.FriDay));
        System.out.println(Days.valueOf("monday").describeConstable());
    }

}
