package Interface;
interface i3{
    final static int c=2;
    void disp();

}
interface i4{
    final static int d=2;
    void show();
    static void test(){
        System.out.println("static method");
    }
    default void test1(){
        System.out.println("default method");
    }

}
class Abc1 implements i3,i4{
    public void disp(){
        System.out.println("disp");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}

public class Interdeno1 {
    public static void main(String args[]){
        Abc1 a= new Abc1();
        a.disp();
        a.show();
        a.test1();
      //  a.test;
        i4.test();
        System.out.println(a.d);
    }
}
