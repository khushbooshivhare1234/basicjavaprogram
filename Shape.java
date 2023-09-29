package Covarient_returntype;
public class Shape {
   public   Shape(){
     }
   public Shape draw(){
        System.out.println("draw method shape class");
        return new Shape();
    }
}

