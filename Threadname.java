package Multithread;

public class Threadname {
    public static void main(String args[]) throws Exception{
        Thread t1 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hii");
                try {Thread.sleep(500);} catch (Exception e) {}
            }
        },"hii thread");
        Thread t2 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hello");
                try {Thread.sleep(500);} catch (Exception e) {}
            }
        } ,"hello thread");
       /* System.out.println(t1.getName());
        System.out.println(t2.getName());*/
     /* t1.setName("hii thread");
      t2.setName("hello thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());*/
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        try { Thread.sleep(100);} catch (Exception e){}
        t2.start();
        // System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("bye");
    }
}
