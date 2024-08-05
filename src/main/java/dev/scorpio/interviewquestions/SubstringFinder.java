package dev.scorpio.interviewquestions;

public class SubstringFinder {
    public static void main(String[] args) {
        String input = "my name is vaibhav";
        int length = 13;
        String result = findSuitableSubstring(input, length);
        System.out.println("Suitable substring: " + result);
    }

    public static String findSuitableSubstring(String str, int length) {
        if (str == null || length <= 0 || length > str.length()) {
            return ""; // Invalid input cases
        }
        // Iterate over possible starting points for the substring
        for (int i = 0; i <= str.length() - length; i++) {
            // Extract substring of the given length
            String substring = str.substring(i, i + length);
            // Check if the substring is valid (does not split words)
            if (isValidSubstring(str, i, i + length)) {
                return substring;
            }
        }
        return ""; // No suitable substring found
    }

    // Check if the substring from startIndex to endIndex splits any words
    private static boolean isValidSubstring(String str, int startIndex, int endIndex) {
        // Check if the start index is at the beginning of a word
        if (startIndex > 0 && str.charAt(startIndex - 1) != ' ') {
            return false; // Starts in the middle of a word
        }
        // Check if the end index is at the end of a word
        if (endIndex < str.length() && str.charAt(endIndex) != ' ') {
            return false; // Ends in the middle of a word
        }
        return true;
    }
}

