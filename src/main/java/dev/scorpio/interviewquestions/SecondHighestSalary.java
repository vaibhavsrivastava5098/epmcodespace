package dev.scorpio.interviewquestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> persons = new ArrayList<>();
        // Add some Person objects to the list
        persons.add(new Person("Alice", 55000));
        persons.add(new Person("Bob", 70000));
        persons.add(new Person("Charlie", 45000));
        persons.add(new Person("David", 85000));
        persons.add(new Person("Eve", 62000));
        // Print out the list of persons with their salaries
        persons.stream().forEach(p -> System.out.println(p.getSalary()));
        System.out.println("Salary after sorting..");
        Optional<Person> secondHighestSalaryPerson = persons.stream().sorted(Comparator.comparingDouble(Person::getSalary).reversed()).skip(1).findFirst();//forEach(p-> System.out.println(p.getSalary()));
        if(secondHighestSalaryPerson.isPresent())
            System.out.println("The second highest salary is: "+secondHighestSalaryPerson.get().getSalary());
    }

    static class Person {
        private String name;
        private double salary;

        public Person(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}

