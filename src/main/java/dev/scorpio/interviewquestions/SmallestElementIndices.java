package dev.scorpio.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SmallestElementIndices {
    // Example array

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 1, 4, 2};
        List<Integer> indices = findSmallestElementIndices(array);
        System.out.println(Arrays.toString(indices.toArray()));
    }

    private static List<Integer> findSmallestElementIndices(int[] array) {
        List<Integer> list = new ArrayList<>();
        OptionalInt min = Arrays.stream(array).min();
        if (min.isPresent())
            System.out.println(min.getAsInt());
        int index = -1;
        for (int i : array) {
            index++;
            if (i == min.getAsInt()) {
                list.add(index);
            }
        }
        return list;
    }
}
