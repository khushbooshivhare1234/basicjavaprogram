package Multithread;
class Hiis extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hii");
            try { Thread.sleep(500);} catch (Exception e){}
        }


    }

}
class Hellos extends Thread{
    public void run()  {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello");
            try { Thread.sleep(500);} catch (Exception e){}
        }
    }

}

public class Demo1{
    public static void main(String args[]){
        Hiis ob1= new Hiis();
        Hellos ob2 = new Hellos();
        ob1.start();
        ob2.start();
       // ob1.get();
        //ob2.get();


    }

}
