package dev.scorpio.interviewquestions;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; // Example array
        int n = array.length + 1; // Since one number is missing, the length should be n-1

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
