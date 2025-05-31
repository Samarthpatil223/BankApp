
package BankProj;
import java.util.*;

public class Main 
{
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        do 
        {
            System.out.println("\n=== Banking App Menu ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Calculate Interest");
            System.out.println("6. View Account Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1 -> createAccount("Savings");
                case 2 -> createAccount("Current");
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> calculateInterest();
                case 6 -> viewAccountDetails();
                case 7 -> System.out.println("Exiting the application...");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } 
        while (choice != 7);
    }

    private static void createAccount(String accountType) 
    {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter Account Holder Name: ");
        scanner.nextLine(); // Consume newline
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = scanner.nextDouble();

        BankAccount account;
        if (accountType.equals("Savings")) 
        {
            account = new SavingsAccount(accountNumber, accountHolderName, initialDeposit);
        } 
        else
         {
            account = new CurrentAccount(accountNumber, accountHolderName, initialDeposit);
        }
        accounts.put(accountNumber, account);
        System.out.println(accountType + " Account created successfully!");
    }

    private static void deposit() 
    {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.next();
        BankAccount account = accounts.get(accountNumber);

        if (account != null) 
        {
            System.out.print("Enter Deposit Amount: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } 
        else 
        {
            System.out.println("Account not found!");
        }
    }

    private static void withdraw() 
    {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.next();
        BankAccount account = accounts.get(accountNumber);

        if (account != null) 
        {
            System.out.print("Enter Withdrawal Amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } 
        else 
        {
            System.out.println("Account not found!");
        }
    }

    private static void calculateInterest() 
    {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.next();
        BankAccount account = accounts.get(accountNumber);

        if (account != null) 
        {
            account.calculateInterest();
        } 
        else 
        {
            System.out.println("Account not found!");
        }
    }

    private static void viewAccountDetails() 
    {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.next();
        BankAccount account = accounts.get(accountNumber);

        if (account != null) 
        {
            account.displayAccountDetails();
        } else 
        {
            System.out.println("Account not found!");
        }
    }
}

