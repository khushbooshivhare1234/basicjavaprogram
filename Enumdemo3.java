package Enum;

public class Enumdemo3 {
    enum Trafficligt{
        green,yellow,red;

    }
    public static void main(String args[]){
        for(Trafficligt tf: Trafficligt.values()){
            System.out.println(tf+" ");

        }

    }
}
