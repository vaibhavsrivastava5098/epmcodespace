package dev.scorpio;

class Kadane {
    //Function to find the sum of contiguous subarray with maximum sum.
    static long maxSubarraySum(int arr[], int n) {

        long maxh = 0, maxf = arr[0];

        //Iterating over the array.
        for (int i = 0; i < n; i++) {

            //Updating max sum till current index.
            maxh += arr[i];
            //Storing max sum so far by choosing maximum between max
            //sum so far and max sum till current index.
            if (maxf < maxh)
                maxf = maxh;

            //If max sum till current index is negative, we do not need to add
            //it to result so we update it to zero.
            if (maxh < 0)
                maxh = 0;

        }
        //returning the result.
        return maxf;
    }

    public static void main(String[] args) {
        System.out.println("hello..");
        int arr[] = {-1,-2,-3,-4};
        long l = maxSubarraySum(arr, 5);
        System.out.println(l);
    }

}
