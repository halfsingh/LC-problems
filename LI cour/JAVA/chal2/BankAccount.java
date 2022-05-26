package chal2;

public class BankAccount {
    private String owner;
    private double Balance;

    public BankAccount(String owner, double Balance) {
        this.setOwner(owner);
        this.setBalance(Balance);
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double withdraw(double amount) {
        if (amount > 0) {
            this.Balance = this.Balance - amount;
        }
        return amount;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            this.Balance = this.Balance + amount;
        }
        return amount;
    }

}
