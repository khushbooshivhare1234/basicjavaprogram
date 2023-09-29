package Covarient_returntype;

public class Newshape {
    public Newshape draw() {
      //  super.draw(); error because it is not a child class this is parent class
        System.out.println("draw method of circle");
        return new Newshape();
    }
}
