import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts; // Stores all bank accounts

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountHolderName, String accountType) {
        int accountNumber = generateAccountNumber();
        Account account;
        if (accountType.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(accountNumber, accountHolderName);
        } else if (accountType.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(accountNumber, accountHolderName);
        } else {
            System.out.println("Invalid account type.");
            return;
        }
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully. Account Number: " + accountNumber);
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    private int generateAccountNumber() {
        return accounts.size() + 1000; // Generates a unique account number
    }
}
