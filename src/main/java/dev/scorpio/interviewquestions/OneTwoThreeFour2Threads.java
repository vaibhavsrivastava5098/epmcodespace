package dev.scorpio.interviewquestions;

public class OneTwoThreeFour2Threads {
    int number = 1;
    int max = 10;

    public static void main(String[] args) {
        OneTwoThreeFour2Threads obj = new OneTwoThreeFour2Threads();
        System.out.println("Using 2 threads to print 1 2 3 4");
        Thread t1 = new Thread(()-> {
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                obj.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }

    public synchronized void printOdd() throws InterruptedException {
        while (number < max) {
            while (number % 2 == 0)
                wait();

            System.out.print(number+" ");
            number++;
            notifyAll();
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (number < max) {
            while (number % 2 != 0)
                wait();

            System.out.print(number+" ");
            number++;
            notifyAll();
        }
    }
}
