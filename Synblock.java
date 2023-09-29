package Multithread;

class Table2 {
    public void printg(int x) throws InterruptedException {
        {
            int i;
            synchronized (this) {
               for (i = 1; i <= 10; i++) {
                   System.out.println(x * i);
                   Thread.sleep(1000);
               }
           }
        }
    }
}
class T2 extends Thread {
    Table2 t;
    T2(Table2 t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printg(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class T4 extends Thread {
    Table2 t;
    T4(Table2 t) {
        this.t = t;
    }
    public void run() {

        try {
            t.printg(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class T6 extends Thread {
    Table2 t;

    T6(Table2 t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printg(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Synblock {
    public static void main(String[] args) throws InterruptedException {
        Table2 t1 = new Table2();
        T2 t2 = new T2(t1);
        T4 t3 = new T4(t1);
        T6 t4 = new T6(t1);
        t2.start();
        t3.start();
        t4.start();
         System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
    }
}
