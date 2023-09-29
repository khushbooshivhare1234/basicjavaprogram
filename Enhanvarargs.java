package com.example.learnj;

import java.util.Scanner;

class Enhan{
    int add(int ... n){  //variable argument
        int sum=0;
        for(int k:n){    //enhanced for loop
            //sum = sum+k;


            sum += k;
        }
        return sum;
    }

}

public class Enhanvarargs {
    public static void main(String a[]){
        Enhan v= new Enhan();
        int n;
        System.out.println("enter size of array");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
       int arr[]= new int[n];
        System.out.println("enter value of array");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("addition :"+" "+v.add(1,2 ,3,4,556,875,5,67));


    }
}
