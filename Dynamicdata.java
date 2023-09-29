package Dynamicdatamethod_Dispatch;
import Covarient_returntype.*;


public class Dynamicdata {
    public static void main(String args[]){
        Shape c=new Cicles();
        c.draw();
     //   Shape s= new Squares();
        c =new Squares();
        c.draw();
       // c= new Newshape(); error because it is parent class they c is already parent class refrence of shape

    }
}
