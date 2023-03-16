package at.gabriel.oo.basics.BankAccounts;

public class CreditAccount extends BaseAccount {
    private double credit;

    public CreditAccount(double credit) {
        this.credit = credit;
    }


    @Override
    public void deposit(double amount) {
        if (getBalance() > 0){
            System.out.println("Kann nicht eingezahlt werden");
        }
        else {
            System.out.println("Neuer Kreditstand " + getBalance());
        }


    }
}
