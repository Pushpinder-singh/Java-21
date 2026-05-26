package java_17.Functional_Interfaces.Lambda_Usecases;

import java.util.*;

class Employee {

    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {

        return id + " " + name + " " + salary;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000),
                new Employee(3, "Bobs", 40000),
                new Employee(2, "Alice", 70000)
        );

        employees.sort((e1, e2) -> e1.id - e2.id);
        employees.forEach(System.out::println);
    }
}