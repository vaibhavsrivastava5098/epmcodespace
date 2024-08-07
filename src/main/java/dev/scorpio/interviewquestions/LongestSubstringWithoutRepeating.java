package dev.scorpio.interviewquestions;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String input = "xyzabcabcb123456789b"; //
        char[] charArray = input.toCharArray();
        int distinctLen = 0;
        int maxDistinctLen = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();
        for(int j=start;j<charArray.length;j++)
        {
            if(!set.contains(charArray[j])) {
                distinctLen++;
                set.add(charArray[j]);
            }
            else
            {
                set.clear();
                if(distinctLen>maxDistinctLen)
                    maxDistinctLen = distinctLen;

                set.add(charArray[j]);
                distinctLen=1;
            }
        }
        System.out.println("Max distinct lenght"+maxDistinctLen);
    }
}
