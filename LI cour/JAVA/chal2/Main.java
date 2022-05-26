package chal2;

public class Main {
    public static void main(String[] args) {
        BankAccount Vijay = new BankAccount("Vijay Karan Singh", 20000);
        System.out.println(Vijay.getBalance());
        System.out.println(Vijay.withdraw(1000));
        System.out.println(Vijay.deposit(200000));
        System.out.println(Vijay.getBalance());

    }
}
