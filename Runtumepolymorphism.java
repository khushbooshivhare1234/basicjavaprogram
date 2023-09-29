package Polymorphism;
class Methodoverridding{
    int x;
    void draw(){
        System.out.println("draw");
    }
}
class Circle  extends Methodoverridding {
    void draw() {
        super.draw();
        System.out.println("circle");
    }
}
class Square extends Methodoverridding{
    void draw(){
        super.draw();
        System.out.println("square");
    }
}
public class Runtumepolymorphism {
    public static void main(String args[]){
        Circle c=new Circle();
        c.draw();
        Square s=new Square();
        s.draw();
    }
}
