package day41_Inheritance.Task02;

public class CheckingAccount extends BankAccount {

     /*
    accountNumber (inherited)
    accountHolder (inherited)
    balance   (inherited)

    deposit  (inherited)
    withdraw
    showBalance  (inherited)
    toString   (inherited)
     */

    public void withdraw(int amount){
        balance -= amount;
    }

}
