package dev.scorpio.interviewquestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatableWords {
    public static void main(String[] args) {
        String s = "this is test test test java java java java";
        String[] s1 = s.split(" ");
        Map<String, Long> map = Arrays.stream(s1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().forEach(e-> System.out.println("The word "+e.getKey()+" has occured "+e.getValue()+" times."));
    }
}
