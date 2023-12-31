
public class BankAccount
{
    private final int accountNumber ;
    private final String accountHolderName;
    private int  balance;
    public  BankAccount(int accountNumber, String accountHolderName, int balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;

    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public int getBalance()
    {
        return balance;
    }

    public void deposit(int amount)
    {
        balance += amount;
    }

    public void withdraw(int amount)
    {
        if(balance>amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("lack of balance");
        }
    }

}