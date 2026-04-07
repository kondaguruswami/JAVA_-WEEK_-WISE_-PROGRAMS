class T1 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch(Exception e) {}
    }
}

class T2 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        } catch(Exception e) {}
    }
}

class T3 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } catch(Exception e) {}
    }
}

public class ThreadExample {
    public static void main(String args[]) {

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.start();
        t2.start();
        t3.start();
    }
}