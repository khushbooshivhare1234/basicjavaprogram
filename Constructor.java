package com.example.learnj;

import java.util.Scanner;

class DefaultConstructor {
     float amt;

    @Override
    public String toString() {
        return "DefaultConstructor{" +
                "amt=" + amt +
                ", tamt=" + tamt +
                '}';
    }

    float tamt=890;
    DefaultConstructor(){
        System.out.println("it is default");
        System.out.println("enter amount");
        Scanner sc= new Scanner(System.in);
        amt =sc.nextFloat();
    }

    DefaultConstructor(int x){
        System.out.println("it is parameterised constructor"+x);

    }
    void deposit(){
        float cur_amt;
        System.out.println("enter amount for deposit");
        Scanner sc= new Scanner(System.in);
        cur_amt= sc.nextFloat();
        amt=amt+cur_amt;
        System.out.println(amt);
    }
    void withdraw(){
        int w;
        System.out.println("enter amount for withdraw");
        Scanner sc= new Scanner(System.in);
        w=sc.nextInt();
        if(w<=amt){
            System.out.println("amount sucessfully withdraw");
            amt=amt-w;
            System.out.println("your current balance is"+ " "+amt);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
}
class Constuctor {
     public static void main(String args[]){
         DefaultConstructor  d= new DefaultConstructor();
         d.deposit();
         d.withdraw();
         DefaultConstructor d2 = new DefaultConstructor(23);

     }
}
