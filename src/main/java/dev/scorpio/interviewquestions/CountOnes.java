package dev.scorpio.interviewquestions;

import java.util.Arrays;

public class CountOnes {
    public static void main(String[] args) {
        System.out.println("Counting number of 1s in a binary array");
        int[] binaryArray = {1, 1, 0};
        long count = Arrays.stream(binaryArray).filter(i -> i == 1).count();
        System.out.println("Total number of 1s are: " + count);
    }
}
