package dev.scorpio.interviewquestions;


public class PermutationUtil {
    public static void main(String[] args) {
        permute("abc");

    }

    private static void permute(String str) {
        permute("", str);
    }


    private static void permute(String prefix, String str) {
        int len = str.length();
        if (len == 0)
            System.out.println(prefix);

        for (int i = 0; i < len; i++) {
            permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        }
    }
}
