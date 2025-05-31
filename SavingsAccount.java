package BankProj;

public class SavingsAccount extends BankAccount 
{
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String accountNumber,String accountHolderName,double initialDeposit) 
    {
        super(accountNumber,accountHolderName,initialDeposit);
    }

    @Override
    public void calculateInterest() 
    {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of Rs "+interest+" added. New Balance: Rs "+balance);
    }
}