package dev.scorpio;

import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 7, 7, 9, 10); // Example list
        int target = 6; // Example target value
        int sum = 0;
        int left =  0;
        int counter = 0;
        while(true)
        {
            sum+=numbers.get(counter);
            if(sum>target)
            {
                left++;
                sum = 0;
                counter = left;
            }
            else if(sum<target)
            {
                counter++;
            }
            else {
                System.out.println("Range found between " + left + " and " + counter);
                break;
            }
        }
    }
}

