package dev.scorpio.interviewquestions;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Reverse the words of this sentence";
        sentence = reverseWords(sentence);
        System.out.println(sentence);  // Output: "sentence this of words the Reverse"
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        sentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            sentence += words[i] + (i != 0 ? " " : "");
        }
        return sentence;
    }
}
