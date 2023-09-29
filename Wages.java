package com.example.learnj;

import java.util.Scanner;

class Employee{
    String name;
    Employee(){
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();


    }
    int hrs;
    int rate;


    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hrs=" + hrs +
                ", rate=" + rate +
                ", salary=" + salary +
                '}';
    }

    void computesalary(){
        System.out.println("enter hrs and rate");
        Scanner sc= new Scanner(System.in);
        hrs=sc.nextInt();
        rate=sc.nextInt();
        salary=hrs*rate;


    }

}
class WageEmployee extends Employee{
    void dis(){
        System.out.println("name"+name+" "+"salary ="+" "+salary);
    }

}
class Sales extends WageEmployee{
    int sales ,commission;
    String name;
    @Override
    void computesalary() {
        super.computesalary();
    }
    void dis2(){
        System.out.println("enter name sale and commission");
        Scanner sc= new Scanner(System.in);
        name= sc.next();
        sales=sc.nextInt();
        commission= sc.nextInt();
        int total;
        total=sales*commission;
        System.out.println("total_commission"+" "+total);

    }
    void dis3(){
        System.out.println("name"+name+" "+"sales ="+" "+sales+" "+"commission"+" "+commission);
    }
}


public class Wages {
    public static void main(String args[]){
       // WageEmployee w=new WageEmployee();
        //w.computesalary();
        //w.dis();
      //  System.out.println(w);
        Sales s=new Sales();
        s.computesalary();
        s.dis2();
        s.dis();
        s.dis3();
        System.out.println(s);






    }
}
