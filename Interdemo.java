package Interface;
interface i1{
    final static int x=1;
    void show();

}
interface i2{
    final static int y=2;
    void disp();


}
class Abc implements  i1,i2{
    Abc(){
        int z=x+y;
        System.out.println(z);
    }
   public void show(){
       System.out.println("show method");

    }
   public void disp(){
       System.out.println("disp method");

    }

}

public class Interdemo {
    public static void main(String args[]){
        Abc a=new Abc();
        a.disp();
        a.show();
    }

}
