package at.gabriel.oo.basics.BankAccounts;

public class Main {
    public static void main(String[] args) {

        CheckingsAccount ca = new CheckingsAccount(3000);
        SavingsAccount sa = new SavingsAccount();
        CreditAccount cra = new CreditAccount(4000);

        System.out.println(ca.getBalance());
        ca.deposit(5000);
        ca.withdraw(9000);
        System.out.println(ca.getBalance());

        System.out.println(sa.getBalance());
        sa.deposit(4000);
        sa.withdraw(5000);
        System.out.println(sa.getBalance());

        System.out.println(cra.getBalance());


    }
}
