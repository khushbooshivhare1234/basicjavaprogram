package Javaclass;

import java.io.IOException; // read method
import java.util.Scanner;

public class User {
    public static void main(String a[]) throws IOException { //read method
        int i,h=67;
        float f;
        double d;
        char c;
        boolean b;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        i= sc.nextInt();
        f=sc.nextFloat();
        d= sc.nextDouble();
        b=sc.nextBoolean();
        s=sc.next();
        c=(char)System.in.read(); // here read method occur exception
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println("a&b"+(h&i));




    }
}
