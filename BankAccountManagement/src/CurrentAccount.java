public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 500.0; // Max overdraft

    public CurrentAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + OVERDRAFT_LIMIT) >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    public void applyOverdraft() {
        System.out.println("Overdraft limit: $" + OVERDRAFT_LIMIT);
    }
}
