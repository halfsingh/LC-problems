package Inheritence;

public class Salesperson extends Employee {

    public Salesperson(
            String name,
            double salary,
            int age,
            double commissionpercentage) {
        super(name, salary, age);
        // TODO Auto-generated constructor stub
        this.commissionpercentage = commissionpercentage;

    }

    public double commissionpercentage;

}
