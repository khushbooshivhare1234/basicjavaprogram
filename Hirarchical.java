package Javaclass;

import java.util.Scanner;

class Fruit{
    String name;
    Fruit(){
        System.out.println("enter name = ");
    }
    void get(){
        Scanner sc =new Scanner(System.in);
        name=sc.nextLine();
        System.out.println(name);
    }

}
class Apple extends Fruit{

}
class Banana extends Fruit{

}
public class Hirarchical {
    public static void main(String aegv[]){
        Banana b=new Banana();
        b.get();
        System.out.println(b.name);
        Apple a= new Apple();
        a.get();
        System.out.println(a.name);
    }

}
