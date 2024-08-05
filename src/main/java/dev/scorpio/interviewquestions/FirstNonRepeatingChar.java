package dev.scorpio.interviewquestions;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
//        String str = "geeksforgeeks";
        String str = "abracadabra";
        char[] charArray = str.toCharArray();
        int[] ints = new int[256];
        for(char ch:charArray)
        {
            ints[ch]++;
        }
        for(char ch:charArray)
        {
            if(ints[ch]==1) {
                System.out.println("The first non repeating character is: " + ch);
                break;
            }

        }
    }
}
