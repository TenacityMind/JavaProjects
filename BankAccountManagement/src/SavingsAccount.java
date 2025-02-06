public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03; // 3% interest rate

    public SavingsAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest applied. New balance: " + balance);
    }
}
