package Multithread;
class HiiS extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hii");
            try { Thread.sleep(500);} catch (Exception e){}
        }


    }

}
class HelloS extends Thread{
    public void run()  {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello");
            try { Thread.sleep(500);} catch (Exception e){}
        }
    }

}


public class Demo2 {
    public static void main(String args[]){
        HiiS ob1= new HiiS();
        HelloS ob2 = new HelloS();
        ob1.start();
        try { Thread.sleep(500);} catch (Exception e){}


        ob2.start();



    }
}
