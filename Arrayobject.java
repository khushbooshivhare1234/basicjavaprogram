package Javaclass;

import java.io.IOException;
import java.util.Scanner;

class Aobj {
    int i;
    float b;
    char c;
    Aobj(){
        System.out.println("hii");
    }



    void set() throws IOException {
     Scanner sc= new Scanner(System.in);
     i= sc.nextInt();
     b=sc.nextFloat();
     c=(char) System.in.read();
 }
 void get(){
     System.out.println(i);
     System.out.println(b);
     System.out.println(c);
 }

}

public class Arrayobject {
    public static void main(String a[]) throws IOException {
       int s;
        System.out.println("enter size");
        Scanner sc= new Scanner(System.in);
        s= sc.nextInt();
      //  Aobj h[] =new Aobj[6];
        Aobj h[] =new Aobj[s];
        for (int j=0;j<h.length;j++){
            h[j]=new Aobj();
          //  System.out.println(h[j].i);
            h[j].set();
            h[j].get();



        }


    }
}
