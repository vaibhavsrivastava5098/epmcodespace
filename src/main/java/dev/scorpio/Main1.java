package dev.scorpio;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + '}';
    }
}
public class Main1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "HR", 55000),
                new Employee("David", "IT", 70000),
                new Employee("Eve", "Finance", 80000),
                new Employee("Frank", "IT", 65000)
        );
        Map<String, Long> map1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        map1.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
    }
}


