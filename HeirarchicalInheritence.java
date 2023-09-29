package com.example.learnj;

import java.util.Scanner;

class Vehicle{
    int id;
    String color;
    int speed;
   void uget() {

       System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        color =sc.next();
        speed=sc.nextInt();

    }
    

}
class Car extends Vehicle{
    int maxspeed;

    void carget(){
        System.out.println("enter");
        Scanner sc=new Scanner(System.in);
        maxspeed= sc.nextInt();
    }
    void cardisp(){
        System.out.println(id +" "+ color+" "+speed+" "+maxspeed);
    }

}
class Truck extends Vehicle{
    int minspeed;
    void trget(){
        System.out.println("enter");
        Scanner sc=new Scanner(System.in);
        minspeed= sc.nextInt();
    }
    void tdisp(){
        System.out.println(id +" "+ color+" "+speed+" "+minspeed);
    }

}

public class HeirarchicalInheritence {
    public static void main(String args[]){
        Car c= new Car();
        Truck t=new Truck();
        c.uget();
        c.carget();
        c.cardisp();

        t.uget();
        t.trget();
        t.tdisp();
        
    }
    
}
