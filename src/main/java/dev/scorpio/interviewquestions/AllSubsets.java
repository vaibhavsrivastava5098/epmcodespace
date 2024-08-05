package dev.scorpio.interviewquestions;

public class AllSubsets {
    static int[] arr = new int[]{1, 2, 3, 4};
    public static void main(String[] args) {
        int len = arr.length;
        printAllSubsets(len);
    }
    private static void printAllSubsets(int n) {
        double num = Math.pow(2, n);
        for (int i = 0; i < num; i++) {
            String s = IntegerToBinaryManual(i, n);
            for (int j = 0; j < n; j++) {
                System.out.print(s.charAt(j) != '0' ? arr[j] : "");
            }
            System.out.println();
        }
    }
    private static String IntegerToBinaryManual(int i, int charLen) {
        StringBuilder sb = new StringBuilder();
        String zeros = "";
        if (i == 0) {
            for (int a = 0; a < charLen; a++)
                zeros += "0";
            return zeros;
        }
        int rem = 0;
        int loopCount = 0;
        while (i != 0) {
            loopCount++;
            rem = i % 2;
            i = i / 2;
            sb.append(String.valueOf(rem));
        }
        while (loopCount != charLen) {
            sb.append("0");
            loopCount++;
        }
        return sb.reverse().toString();
    }
}
