/*3. Simple Bank Account:
•	Create a BankAccount class with attributes like account number, balance, and account holder name.
•	Implement methods for depositing and withdrawing money, checking the balance, and displaying account details.
•	Create multiple BankAccount objects and perform banking operations.
 */
class BankAccount{
    int accountNumber;
    double balance;
    String accountHolder;
    BankAccount(String accountHolder, double balance, int accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void depositMoney(double depositamount){
        balance+=depositamount;
        System.out.println("Amount deposited successfully");
    }
    public void withdrawMoney(double Withdrawamount){
        if (balance>=Withdrawamount){
            balance-=Withdrawamount;
            System.out.println("Balance withdrew Successfully");
        }
        else{
            System.out.println("You have not sufficient balance to withdraw");
        }
    }
    public void checkBalance(){
        System.out.println("Balance in account is RS"+balance);
    }
    public void displayAccountDetails(){
        System.out.println("Name: "+accountHolder);
        System.out.println("Balance: "+balance);
        System.out.println("Account Number: "+accountNumber);
    }
}
public class SimpleBankSystem{
    public static void main(String[] args) {
        BankAccount obj1=new BankAccount("Mushtaque Ahmed",2000000.00,12345);
        BankAccount obj2=new BankAccount("Aftab Ahmed",3000000.00,29345);
        BankAccount obj3=new BankAccount("Ghulam Ahmed",2400000.00,74658);
        obj1.depositMoney(200000);
        System.out.println();
        obj1.withdrawMoney(3000000);
        System.out.println();
        obj1.checkBalance();
        System.out.println();
        obj1.displayAccountDetails();
        System.out.println();
        obj2.depositMoney(20000);
        System.out.println();
        obj2.withdrawMoney(2500000);
        System.out.println();
        obj2.checkBalance();
        System.out.println();
        obj2.displayAccountDetails();
        System.out.println();
        obj3.depositMoney(200000);
        System.out.println();
        obj3.withdrawMoney(3000000);
        System.out.println();
        obj3.checkBalance();
        System.out.println();
        obj3.displayAccountDetails();
    }
}