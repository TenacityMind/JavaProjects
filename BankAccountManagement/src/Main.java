import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter account type (Savings/Current): ");
                    String type = scanner.nextLine();
                    bank.createAccount(name, type);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accountNum = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    Account acc = bank.getAccount(accountNum);
                    if (acc != null) acc.deposit(depositAmount);
                    else System.out.println("Account not found.");
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int accNumWithdraw = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    Account accWithdraw = bank.getAccount(accNumWithdraw);
                    if (accWithdraw != null) accWithdraw.withdraw(withdrawAmount);
                    else System.out.println("Account not found.");
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int accNumView = scanner.nextInt();
                    Account accView = bank.getAccount(accNumView);
                    if (accView != null) accView.viewBalance();
                    else System.out.println("Account not found.");
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
