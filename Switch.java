package com.example.learnj;

public class Switch {
    public static void main(String a[]){
        String i ="tus";
        String result;
      /*  switch (i){
            case "monday"-> result="6am";
            default -> result="7am";
        }*/
       /* result=switch (i){
            case "monday","tuesday":yield "6am";
            default:yield "7am";

        };*/
        switch (i){
            case "monday":
                System.out.println("6am");
                break;

            case "sunday","tus"://old version
                System.out.println("6am");
                break;
            default:
                System.out.println("6");

        }

       // System.out.println(result);
    }
}
