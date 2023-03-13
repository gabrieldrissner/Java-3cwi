package at.gabriel.oo.basics.BankAccounts;

public class CreditAccount extends BaseAccount {
    private double limit;

    public CreditAccount(double limit) {
        this.limit = limit;
    }

    public double credit() {
        setBalance(0);


        return 0;
    }
}
