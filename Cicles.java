package Covarient_returntype;

public class Cicles extends Shape {
    public Cicles draw() {
        super.draw();
        System.out.println("draw method of circle");
        return new Cicles();
    }
}
