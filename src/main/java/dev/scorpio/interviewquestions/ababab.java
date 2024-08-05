package dev.scorpio.interviewquestions;

public class ababab {

    boolean isPrintA = true;
    private int counter;
    private int max = 10;

    public static void main(String[] args) {
        ababab obj = new ababab();
        Thread aThread = new Thread(() -> {
            try {
                obj.printA();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread bThread = new Thread(() -> {
            try {
                obj.printB();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        aThread.start();
        bThread.start();
    }

    public synchronized void printA() throws InterruptedException {
        while (counter < max) {
            while (!isPrintA)
                wait();
            System.out.print(" a");
            notifyAll();
            isPrintA = false;
            counter++;
        }
    }

    public synchronized void printB() throws InterruptedException {
        while (counter < max) {
            while (isPrintA)
                wait();
            System.out.print("b");
            notifyAll();
            isPrintA = true;
            counter++;
        }
    }
}

