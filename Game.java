package com.example.learnj;

import java.util.Scanner;

class Games{
    Games(){
        System.out.println("default game con");
    }
    int id;
    String name;
    void details(){
        System.out.println("enter id and name");
        Scanner sc=new Scanner(System.in);
        id = sc.nextInt();
        name=sc.nextLine();
    }



}
class Board extends Games{
    Board(){
        super();
        System.out.println("default board");
    }
    String gname;
    void gname(){
        System.out.println("game name");
        Scanner sc= new Scanner(System.in);
        gname=sc.nextLine();

    }

}
class Chess extends Board{
    Chess(){
        super();
        System.out.println("default chess");
    }
    void disp(){
        System.out.println(id +" "+ name+" "+gname);
    }


}
public class Game {
    public static void main(String args[]){
        Chess c=new Chess();
        c.details();
        c.gname();
        c.disp();


    }

}
