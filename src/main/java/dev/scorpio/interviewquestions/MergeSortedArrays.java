package dev.scorpio.interviewquestions;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Example sorted arrays
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] newArr = new int[arr1.length+arr2.length];

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt = 0;

        while(cnt1< arr1.length && cnt2<arr2.length)
        {
            if(arr1[cnt1]<=arr2[cnt2])
            {
                newArr[cnt]=arr1[cnt1];
                cnt++;
                cnt1++;
            }
            else
            {
                newArr[cnt]=arr2[cnt2];
                cnt++;
                cnt2++;
            }
        }
        while(cnt1<arr1.length) {
            newArr[cnt++] = arr1[cnt1];
            cnt1++;
        }
        while(cnt2<arr2.length) {
            newArr[cnt++] = arr2[cnt2];
            cnt2++;
        }

        Arrays.stream(newArr).forEach(i-> System.out.println(i));

    }
}
