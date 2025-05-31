package BankProj;

public class CurrentAccount extends BankAccount 
{
    private static final double OVERDRAFT_LIMIT =10000;

    public CurrentAccount(String accountNumber,String accountHolderName,double initialDeposit) 
    {
        super(accountNumber,accountHolderName,initialDeposit);
    }

    @Override
    public void calculateInterest() 
    {
        System.out.println("No interest for Current Accounts.");
    }

    @Override
    public void withdraw(double amount) 
    {
        if (amount>balance+OVERDRAFT_LIMIT) 
        {
            System.out.println("Overdraft limit exceeded!");
        } 
        else 
        {
            balance-=amount;
            System.out.println("Rs "+amount+" withdrawn. Remaining Balance: Rs "+balance);
        }
    }
}
