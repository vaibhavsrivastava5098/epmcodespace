package dev.scorpio;

public class Main {
    public static void main(String[] args) {
        System.out.println("just testing java 11 feature..");
        int[] ints = {21,5,1,7,9,3,12};
        int len = 3;
        largestSumSubarray(ints, len);
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

