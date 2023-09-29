package com.example.learnj;

import java.util.Scanner;

class Employee3{
    int id,age;
    String name,department,address;
    float salary;
    void get(){
        System.out.println("id,name,age,department,address,salary");
        Scanner sc=new Scanner(System.in);
        id= sc.nextInt();
        name= sc.nextLine();
        age=sc.nextInt();
        department= sc.next();
        address= sc.next();
        salary=sc.nextFloat();


    }
    void set(){
        System.out.println("id"+" "+ id+" "+"name"+name+"age"+" "+ age+" "+"department"+department+"address"+" "+ address+" "+"salary"+salary);
    }


}
public class Array2 {
    public static void main(String args[]){
        int i,n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        Employee3 emp[]=new Employee3[n];//5
      //  Scanner k=new Scanner(System.in);
        for(i=0;i<n;i++){
            emp[i]=new Employee3();// for creating memory for array object
            emp[i].get();


        } for(i=0;i<n;i++){
            //emp[i]=new Employee3();
            emp[i].set();


        }

    }
}
