package BankProj;

public class Transaction 
{
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(String transactionId,String transactionType,double amount) 
    {
        this.transactionId=transactionId;
        this.transactionType=transactionType;
        this.amount=amount;
    }

    public void displayTransactionDetails() 
    {
        System.out.println("Transaction ID: "+transactionId);
        System.out.println("Transaction Type: "+transactionType);
        System.out.println("Amount: Rs "+amount);
    }
}

