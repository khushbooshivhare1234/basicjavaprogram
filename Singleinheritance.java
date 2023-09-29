package com.example.learnj;

import java.util.Scanner;

class parent{
    String color,cast,nationality;
    void pget(){
        System.out.println("enter color, cast,nationality");
        Scanner sc=new Scanner(System.in);
        color= sc.next();
        cast= sc.next();
        nationality= sc.next();

    }


}
class Child1 extends parent {
    int height, age;
    String name;

    void cget() {
        System.out.println("enter name, height and age");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        height = sc.nextInt();
        age = sc.nextInt();
    }

}

public class Singleinheritance {
    public static void main(String args[]){
        Child1 c1= new Child1();
        c1.pget();
        c1.cget();

    }
}
