package dev.scorpio.interviewquestions;

public class Print1space122space122333 {

    public static void main(String[] args) {
        System.out.println("hello");

        String prev = "";
        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if(j==1)
                    System.out.print(prev);
                System.out.print(i + " ");
                prev += String.valueOf(i+" ");
            }
        }
    }
}
