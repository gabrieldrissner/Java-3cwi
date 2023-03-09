package at.gabriel.oo.basics.BankAccounts;

public class BaseAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public double withdraw(double amount){
        balance = balance - amount;
        return amount;
    }
}
