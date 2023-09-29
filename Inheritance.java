package Javaclass;

import java.util.Scanner;

class Single{
    int a,b,d,f;
    Single(){
        System.out.println("first");
    }
    void setA(){
        System.out.println("enter a and b");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
    }
    void k(){
        int d=2,f=4;
        this.d=d;
        this.f=f;
    }
}
class Child extends Single {
    int a=9;
    Child(){
        super();
        System.out.println("sec");
    }
    void getB() {
        System.out.println(super.a + b);
        System.out.println(d+f);
    }
    void k(){
        super.k();
        System.out.println("thanyou"+ super.a);
    }
}
    public class Inheritance {
        public static void main(String s[]){
            Child c= new Child();
            c.setA();
            c.k();
            c.getB();
        }
}


