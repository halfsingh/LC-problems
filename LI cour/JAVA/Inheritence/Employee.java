package Inheritence;

public class Employee {
    private String name;
    protected double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raisesalary() {
        this.salary = this.salary * 1.2;

    }

}
