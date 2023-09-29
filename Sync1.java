package Multithread;

class Table {
      public synchronized void printg(int x) throws InterruptedException {
        {
            int i;

            for (i = 1; i <= 10; i++) {
                System.out.println(x * i);
                Thread.sleep(1000);
            }
        }
    }

}
class T_1 extends Thread {
    Table t;
    T_1(Table t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printg(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class T_10 extends Thread {
        Table t;
        T_10(Table t) {
            this.t = t;
        }
        public void run() {

            try {
                t.printg(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
class T_100 extends Thread {
    Table t;

    T_100(Table t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printg(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Sync1 {
        public static void main(String[] args) throws InterruptedException {
            Table t1 = new Table();
            T_1 t2 = new T_1(t1);
            T_10 t3 = new T_10(t1);
            T_100 t4 = new T_100(t1);
            t2.start();
            t3.start();
            t4.start();
            System.out.println(t2.getPriority());
            System.out.println(t3.getPriority());
            System.out.println(t4.getPriority());
        }
}

