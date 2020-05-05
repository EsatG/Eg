package day33_CustomClass;

public class BankAccount {
    /*
    practice task:
    create a custom class for bank account
      attributes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
     */

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance (){

        System.out.println("Available Balance: " + balance);
    }

    public void withDraw(double amount){
        if(balance <= 0){
            System.out.println("There is no money");
        }

        else if (amount > balance){
            System.out.println("Withdrawing $" + amount);
            balance -= amount + 35;
        } else {
            System.out.println("Withdrawing $" + amount);
            balance -= amount;
        }

    }

    public void deposit (double amount){
        System.out.println("Depositing $" + amount);
        balance += amount;
    }

    public String toString( ){
        return "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAvailable Balance: " + balance;
    }









}
