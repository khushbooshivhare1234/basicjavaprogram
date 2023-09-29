package Multithread;

public class Priority {
    public static void main(String args[]) throws Exception{
        Thread t1 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hii "+ Thread.currentThread().getPriority());
                try {Thread.sleep(500);} catch (Exception e) {}
            }
        });
        Thread t2 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hello"+ Thread.currentThread().getPriority());
                try {Thread.sleep(500);} catch (Exception e) {}
            }
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);//Thread_NOr
      //  t1.setPriority(1);// least priority range b/w 1 t0 10
        // t2.setPriority(10);// high priority
        System.out.println(t1.getPriority());//if we don't set the priority by default both are equal 5 means normal
        System.out.println(t2.getPriority());
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
