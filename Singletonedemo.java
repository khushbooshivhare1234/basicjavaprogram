package Singleton_class;
class Singledemo{
    static Singledemo s=null;
   private Singledemo() { //this is private constructor that why we can not create outside object of this that's why we create inside
       System.out.println("only one object created");
       System.out.println(s);
   }

    static void show(){
        if (s==null){
             s=new Singledemo();
            System.out.println(s);//Singleton_class.Singledemo@2e817b38
        }
        else {
            System.out.println("no more object created"+s);
        }
    }
    static void get(){
        System.out.println("khushboo");
    }
   protected Singledemo(int x){//we can create multiple object of protected constructed
        System.out.println("shivhare");

    }
}

public class Singletonedemo {
    public static void main(String args[]){
      // Singledemo s= new Singledemo(); Singledemo()' has private access in 'Singleton_class.Singledemo'
        Singledemo.show();
        Singledemo.show();
        Singledemo.show();
        Singledemo.get();
        Singledemo a=new Singledemo(23);
        a.get();
        Singledemo b=new Singledemo(45);

    }
}
