package chal1;

public class Employee {
    String name;
    int age;
    int salary;
    String location;

    Employee(String name, int age, int salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary() {
        this.salary = salary * 4;
        System.out.println("Employee " + this.name + "'s Salary has been raised");
    }
}
