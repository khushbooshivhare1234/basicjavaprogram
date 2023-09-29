package com.example.learnj;

import java.util.Scanner;
class Mummmy{
        String color,cast,nationality;
        void pget(){
        System.out.println("enter color, cast,nationality");
        Scanner sc=new Scanner(System.in);
        color= sc.next();
        cast= sc.next();
        nationality= sc.next();

        }


        }
class Girl extends Mummmy{
    int height,age;
    String name;
    void cget(){
        System.out.println("enter name, height and age");
        Scanner sc= new Scanner(System.in);
        name = sc.nextLine();
        height= sc.nextInt();
        age= sc.nextInt();
    }




}
class Boy extends Girl {
    String gender;
    void get() {
        System.out.println("enter gender");
        Scanner sc = new Scanner(System.in);
        gender = sc.next();
    }
    void disp(){
        System.out.println(name+" "+age+" "+cast+" "+color+" "+height+" "+nationality+" "+gender);
    }

}


public class multilevelInheritence {
    public static void main(String args[]){
        Boy b= new Boy();
        b.pget();
        b.cget();
        b.get();
        b.disp();


    }
}
