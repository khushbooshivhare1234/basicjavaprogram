package Multithread;
class Hii extends Thread{
   public void get(){
       for(int i=0;i<=5;i++){
           System.out.println("hii");
           try { Thread.sleep(500);} catch (Exception e){}
       }


    }

}
class Hello extends Thread{
    public void get()  {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello");
           try { Thread.sleep(500);} catch (Exception e){}
    }
    }

}


public class Demo {
    public static void main(String args[]){
        Hii ob1= new Hii();
        Hello ob2 = new Hello();
        ob1.get();
        ob2.get();


    }
}
