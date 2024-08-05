package dev.scorpio.interviewquestions;

public class KConsecutiveCharsRemove {
    static boolean found = false;
    public static void main(String[] args) {
        System.out.println("Removing k consecutive occurences..");
        String str = "qddxxxd";
        int k = 3;

        String finalString = removeKConsecutiveChars(str, k);
        System.out.println("The final string is: "+finalString);
    }

    private static String removeKConsecutiveChars(String str, int k) {
        char[] charArray = str.toCharArray();
        found = false;
        for(char ch:charArray)
        {
            String pattern = getPattern(k, ch);
            if(str.contains(pattern))
            {
                found = true;
                int index = str.indexOf(pattern);
                str = str.substring(0,index)+str.substring(index+k);
                break;
            }
        }
       /* if(!found) {
            return str;
        }*/
        if(found)
            removeKConsecutiveChars(str, k);
        return str;
    }

    private static String getPattern(int k, char ch)
    {
        String pattern = "";
        for(int i=0;i<k;i++)
            pattern+=ch;

        return pattern;
    }
}
