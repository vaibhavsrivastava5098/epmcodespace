package dev.scorpio;

import java.util.Arrays;
import java.util.List;

public class Java8 {
    public static void main(String[] args) {
        /*System.out.println("Hello Java 8.");
        List<String> countries = Arrays.asList("Afghanistan", "Albania", "Algeria", "Andorra", "Angola",
                "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan");

        countries.stream().filter(c->c.startsWith("Al")).toList().forEach(c-> System.out.println(c));

        MyFunctionalInterface op1 = (a,b)->a+b;
        MyFunctionalInterface op2 = (a,b)->a*b;

        int operation1 = op1.operation(3, 4);
        int operation2 = op2.operation(1, 2);
        System.out.println(operation1+" "+operation2);*/
        var integers = List.of(1, 2, 3, 4);
        for(var i:integers)
            System.out.println(i);

        List.copyOf(integers);
        integers.add(5);

    }
}

interface MyFunctionalInterface{
    public int operation(int a, int b);
}