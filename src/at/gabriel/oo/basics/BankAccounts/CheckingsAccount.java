package at.gabriel.oo.basics.BankAccounts;

public class CheckingsAccount extends BaseAccount {
    private double limit;

    public CheckingsAccount(double limit) {
        this.limit = limit;
    }

    public double withdraw(double amount) {
        if ((getBalance() - amount) > (limit * -1)) {
            System.out.println("Withdraw " + amount + " Euros");
            setBalance(getBalance() - amount);
            return super.withdraw(amount);
        } else {
            System.out.println("Leider keine Deckung");
            return 0;
        }
    }

}

