package dev.scorpio.interviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondHighestInArrayUnsorted {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 3, 6, 2, 9};
        Integer i = Arrays.stream(array).boxed().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println("The second highest number in the array is: "+i);

        //Find the top 3 elements of a integer array.
        System.out.println("Finding the top 3 elements of the array.");
        Stream<Integer> limit = Arrays.stream(array).boxed().distinct().sorted(Collections.reverseOrder()).limit(3);
        limit.forEach(ii-> System.out.println(ii));
    }
}
