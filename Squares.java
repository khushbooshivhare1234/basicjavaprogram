package Covarient_returntype;

public class Squares extends Shape {
    public Squares draw() {
        super.draw();
        System.out.println("draw method of square");
        return new Squares();
    }
}
