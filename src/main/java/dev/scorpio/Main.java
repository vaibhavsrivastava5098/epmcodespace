package dev.scorpio;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("just testing java 11 feature..");
        int[] ints = {21,5,1,7,9,3,12};
        int len = 3;
        largestSumSubarray(ints, len);*/
        String input = "aabbcccddddeeefffff"; // Example input
        findSecondHighestOccurrence(input);
    }

    private static void findSecondHighestOccurrence(String input) {
        Map<Integer, Long> map = input.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        collect.entrySet().stream().sorted((Comparator<? super Map.Entry<Integer, Long>>) Map.Entry.comparingByValue().reversed()).collect(Collectors.toMap())
        List<Long> list = map.values().stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        Long l = list.get(1);
        System.out.println(l);
    }

    private static void largestSumSubarray(int[] ints, int len) {
        int sum = 0;
        for(int i=0;i<len;i++)
        {
            sum+=ints[i];
        }
        int maxSum = sum;
        int count = 0;
        for(int i=len;i<ints.length;i++)
        {
            sum+=ints[i];
            sum-=ints[count++];

            if(sum>maxSum)
            {
                maxSum = sum;
            }
        }
        System.out.println("The maximum sum of "+len+" consecutive numbers is: "+maxSum);
    }
}

