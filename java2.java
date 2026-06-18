
class junit {
    protected String accountHolder;
    public double balance;
    public junit(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends junit {
    public double interestRate;
    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void displaySavingsInfo() {
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
public class java2{
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("Belintra", 50000, 6.5);

        System.out.println("--- Savings Account Details ---");
        sa.displaySavingsInfo();
    }
}