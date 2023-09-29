package Multithread;
class Hiii implements Runnable { //hiI error
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hii");
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}
class Hellss implements Runnable{//HellO error
    public void run()  {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello");
            try { Thread.sleep(500);} catch (Exception e){}
        }
    }
}
public class Demo3 {
    public static void main(String args[]){
        Runnable ob1= new Hiii();
        Runnable ob2 = new Hellss();
        Thread t1 =new Thread(ob1);
        Thread t2 =new Thread(ob2);
        t1.start();
        try { Thread.sleep(10);} catch (Exception e){}
        t2.start();
    }
}
