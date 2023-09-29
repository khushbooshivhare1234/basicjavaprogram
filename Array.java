package Javaclass;

import java.util.Scanner;

public class Array {
    public static void main(String a[]){
        int arr[],b;
        arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        float arr2[]={1.3f,3.5f};
        System.out.println("enter the how many row in a  array");//user input of row size means size of 1d array
        Scanner sc= new Scanner(System.in);
        b=sc.nextInt();
        int arr3[][] =new int[b][],l,m,q,u;//jagged array int[3][] this is used when we take row size at compile  time
     //   Scanner sc= new Scanner(System.in);
       /* System.out.println("enter the column size");
       l= sc.nextInt(); // this is used when row sized is not take by user
        m=sc.nextInt();
        q=sc.nextInt();*/
        for (int r=0;r<b;r++){//user input of column
            System.out.println("enter the column size of row = " +" "+r);
            u=sc.nextInt();
            arr3[r]=new int[u];
        }

       /* arr3[0]=new int[l];//initialize row to how much  column they have eg 0 row has 3 column where they store 3 variable in it
        arr3[1]=new  int[m];
        arr3[2]=new int[q];*/
        System.out.println("enter the value");
        for(int i=0;i<arr3.length;i++){// taking user value
            for(int j=0;j < arr3[i].length;j++){

                arr3[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int[] n:arr3){// for printing
            for(int s:n){
                System.out.print(s+" ");
            }
            System.out.println();

        }


    }
}
