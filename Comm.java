package com.example.learnj;

public class Comm {
    public static void main(String args[]){

       float p,j,k;
        p=Float.parseFloat(args[0]);
        j=Float.parseFloat(args[1]);
        int i;
        for(i=0; i< args.length;i++){
            System.out.println("number"+" "+args[i]);
        }
        System.out.println("length"+" "+args.length);
        k=p+j;
        System.out.println("add="+k);
        k=p*j;
        System.out.println("multiply="+k);
        k=p/j;
        System.out.println("divide="+k);
        k=p%j;
        System.out.println("mould"+k);
        k=p-j;
        System.out.println("minus"+k);



    }
}
