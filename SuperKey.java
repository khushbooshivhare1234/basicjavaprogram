package com.example.learnj;
class Base {
    float f=3.14f;
    Base(){
        System.out.println("base class contructor");

    }
    Base(int x){
        System.out.println("base class para constructor");
        System.out.println(x);

    }
    void show(){
        System.out.println("show method of base class");
    }

}
class Derived extends Base{
    float f=90.4f;
    Derived(){
        super();
        System.out.println("derived class constructor");
    }
    Derived(int y){
        super(y);
        System.out.println("derived class para constructor");
        System.out.println(y);

    }
    void  disp(){
        System.out.println(f);
        System.out.println(super.f);
    }
    void show(){
        super.show();
        System.out.println("show method of derived class");
    }

}



public class SuperKey {
    public static void main(String args[]){
     Derived d1=new Derived();
     Derived d2=new Derived(45);
     d1.disp();
     d2.disp();
     d1.show();
     d2.show();

    }
}
