package dev.scorpio.interviewquestions;

public class Threads123 {

    int counter = 1;
    int max = 3;

    public static void main(String[] args) {
        Threads123 obj = new Threads123();
        System.out.println("Three threads to write 123...");
        Thread t1 = new Thread(() -> {
            try {
                obj.print1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                obj.print2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                obj.print3();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

    public synchronized void print1() throws InterruptedException {
        while (counter < max) {
            while (counter != 1)
                wait();

            System.out.println(counter + " " + Thread.currentThread().getName());
            notifyAll();
            counter++;
        }
    }

    public synchronized void print2() throws InterruptedException {
        while (counter < max) {
            while (counter != 2)
                wait();

            System.out.println(counter + " " + Thread.currentThread().getName());
            notifyAll();
            counter++;
        }
    }

    public synchronized void print3() throws InterruptedException {
        while (counter < max) {
            while (counter != 3)
                wait();

            System.out.println(counter + " " + Thread.currentThread().getName());
            notifyAll();
            counter++;
        }
    }
}
