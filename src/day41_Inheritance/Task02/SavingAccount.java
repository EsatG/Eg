package day41_Inheritance.Task02;

public class SavingAccount  extends BankAccount{

    /*
    accountNumber (inherited)
    accountHolder (inherited)
    balance   (inherited)

    interestRate

    deposit  (inherited)
    showBalancce  (inherited)
    toString   (inherited)
     */

    public static double interestRate;

    static {
        interestRate = 0.02;
    }




}
