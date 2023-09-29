package Polymorphism;
class Methodoverloading{
    int x=5;
    void area(){
        System.out.println(x*x);
    }
    void area(int s){
        System.out.println(s*s);
    }
    void area(int l,int b){
        System.out.println(l*b);
    }

}

public class Compiletimepolymorphism {
    public static void main(String args[]){
        Methodoverloading m=new Methodoverloading();
        m.area();
        m.area(3);
        m.area(4,3);

    }
}
