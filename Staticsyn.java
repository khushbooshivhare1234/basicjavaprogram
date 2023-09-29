package Multithread;
class Table3 {
    public synchronized static void printg(int x) throws InterruptedException {
        {
            int i;
            for (i = 1; i <= 10; i++) {
                System.out.println(x * i);
                Thread.sleep(1000);
            }
        }
    }

}
class T9 extends Thread {
    public void run() {
        try {
            Table3.printg(9);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class T18 extends Thread {
    public void run() {
        try {
            Table3.printg(18);
        } catch (InterruptedException e) {

        }
    }
}
class T36 extends Thread {
    public void run() {
        try {
            Table3.printg(36);
        } catch (InterruptedException e) {

        }
    }
}

public class Staticsyn {
    public static void main(String[] args) throws InterruptedException {
        T9 t2 = new T9();
        T18 t3 = new T18();
        T36 t4 = new T36();
        t2.start();
        t3.start();
        t4.start();

    }
}
