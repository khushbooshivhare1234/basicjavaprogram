package Multithread;

public class Joindemo {
    public static void main(String args[]) throws Exception{



        Thread t1 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hii");
                try {Thread.sleep(500);} catch (Exception e) {}
            }
        });
        Thread t2 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hello");
                try {Thread.sleep(500);} catch (Exception e) {}
            }
        });

        t1.start();
        try { Thread.sleep(100);} catch (Exception e){}
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("bye");

    }

}
