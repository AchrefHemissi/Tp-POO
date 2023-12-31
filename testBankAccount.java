import java.util.Scanner;

public class testBankAccount 
{
    public static void main(String[] args)
    {
        System.out.println("Give the bank account's number: ");
        Scanner Sc = new Scanner(System.in);
        int a =Sc.nextInt();
        System.out.println("Give the bank account's balance: ");
        int c =Sc.nextInt();
        System.out.println("Give the bank account's HolderName: ");
        String b=Sc.next();
        BankAccount account=new BankAccount(a, b, c);
        System.out.println("The bank account's number is: "+account.getAccountNumber());
        System.out.println("The bank account's HolderName is: "+account.getAccountHolderName());
        System.out.println("The bank account's balance is: "+account.getBalance());
        System.out.println("if you want  to deposit money print '1' else print '0'");
        int choix = Sc.nextInt();
        if (choix==0)
        {
            System.out.println("Give me the amount to withdraw from the bank");
            account.withdraw(Sc.nextInt());
        }

        else
        {
            System.out.println("Give me the amount to deposit from the bank");
            account.deposit(Sc.nextInt());
        }
        System.out.println("The bank account's number is: "+account.getAccountNumber());
        System.out.println("The bank account's HolderName is: "+account.getAccountHolderName());
        System.out.println("The bank account's balance is: "+account.getBalance());
        Sc.close();
    }

}

