package dev.scorpio.interviewquestions;

public class AABBFormatChecker {
    public static void main(String[] args) {
        System.out.println(checkIfAABBForamt("aabb"));
    }

    private static boolean checkIfAABBForamt(String str) {
        int len = str.length();
        if (len == 0 || len % 2 != 0)
            return false;

        for (int i = 0; i < len / 2; i++) {
            if (!(str.charAt(i) == 'a' && str.charAt(len - i - 1) == 'b'))
                return false;
        }
        return true;
    }
}
