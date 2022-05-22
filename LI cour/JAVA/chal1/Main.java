package chal1;

public class Main {
    public static void main(String[] args) {
        Employee Vijay = new Employee("Vijay Karan Singh", 25, 5140, "New Delhi");
        Employee Sagar = new Employee("Sagar Sharma", 24, 17990, "New Delhi");
        Vijay.raiseSalary();
        System.out.println(Sagar.name + "'s salary is " + Sagar.salary);
        System.out.println(Vijay.name + "'s salary is " + Vijay.salary);
    }

}
