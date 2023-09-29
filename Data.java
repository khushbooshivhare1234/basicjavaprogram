package Javaclass;

public class Data {
    int a=15;// data member or instance variable and this a we cant use as in a other class in a same package
   static float f=15.23f;// static variable
    void display(){
        System.out.println("display method");
    }
    public static void main(String a[]){
        double d=24.5;//local variable
        char c='g';
      //  int e; if we want to access e this make error because it is blank and if we access that value this make compile time  error
        String s="khushboo";
        boolean b= true;
        System.out.println(b +"\n"+d+"\n"+c+"\n"+f);
        //e not access like b and d and c here we can also access f but not a ,because a is instance variable and f is static variable that why we access in a static method as well as normal method
        Data d1= new Data();// to access a and method outside the main function to access this method we have to create object of a class and we also access f with object
        System.out.println(d1.a+"\n"+d1.f);
        d1.display();

    }
}
