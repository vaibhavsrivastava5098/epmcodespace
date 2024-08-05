package dev.scorpio.interviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Class to represent a student
class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Override toString for easier debugging
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}

public class StudentMapExample {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 12));
        students.add(new Student(2, "Bob", 9));
        students.add(new Student(3, "Charlie", 15));
        students.add(new Student(4, "David", 10));
        students.add(new Student(5, "Eve", 13));

        Map<Integer, String> map = students.stream().filter(s -> s.getAge() > 10).collect(Collectors.toMap(Student::getId, Student::getName));
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
    }
}