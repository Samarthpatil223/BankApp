package BankProj;

public abstract class BankAccount 
{
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber,String accountHolderName,double initialDeposit) 
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=initialDeposit;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) 
    {
        balance+=amount;
        System.out.println("Rs "+amount+" deposited. New Balance: Rs "+balance);
    }

    public void withdraw(double amount) 
    {
        if(amount>balance) 
        {
            System.out.println("Insufficient balance!");
        } 
        else 
        {
            balance-=amount;
            System.out.println("Rs" + amount + " withdrawn. Remaining Balance: Rs" + balance);
        }
    }

    public void displayAccountDetails() 
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Balance: Rs "+balance);
    }

    public String getAccountNumber() 
    {
        return accountNumber;
    }
}
