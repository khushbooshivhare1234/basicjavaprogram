package Multithread;

class Tables {
    public  void printg(int x) throws InterruptedException {
        {
            int i;

            for (i = 1; i <= 10; i++) {
                System.out.println(x * i);
                Thread.sleep(1000);
            }
        }
    }

}
class T1 extends Thread {
    Tables t;
    T1(Tables t) {
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

class T10 extends Thread {
    Tables t;
    T10(Tables t) {
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
class T100 extends Thread {
    Tables t;

    T100(Tables t) {
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


public class Join1 {
    public static void main(String args[]) throws InterruptedException {
        Tables t1 = new Tables();
        T1 t2 = new T1(t1);
        T10 t3 = new T10(t1);
        T100 t4 = new T100(t1);
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        System.out.println(t4.getPriority());
    }
}
