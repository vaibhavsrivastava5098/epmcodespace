package dev.scorpio.interviewquestions;

import java.util.List;
import java.util.stream.Stream;

public class CompareToExample
{
    public static void main(String[] args) {
        System.out.println("This is compareto example..");
        List<Person> people = List.of(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
        people.stream().forEach(p-> System.out.println(p));
        Stream<Person> sorted = people.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        sorted.forEach(p-> System.out.println(p));
    }
}
