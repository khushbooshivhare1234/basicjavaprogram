package Javaclass;
class A{
    A(){
        System.out.println("hii");
    }
    void gen(){ //function overriding
        System.out.println("f");
    }
    void methodhiding(){ //method hiding
        System.out.println("kkk");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("hello");
    }
    void gen(){//function overriding
        super.gen();
        System.out.println("m");
    }
    void methodhiding(int q){ //method hiding
        super.methodhiding();

        System.out.println("q"+q);

    }
}
class C extends B{
    C(){
        super();
        System.out.println("hye");
    }
    void gen(){//function overriding
        super.gen();
        System.out.println("okk");

    }

}


public class Multilevel {
    public static void main(String args[]){
        C ob= new C();
        ob.gen();
        ob.methodhiding(6);

    }
}
