package day33_CustomClass;

public class CapitalOne {

    /*
    1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing amount is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
     */
    public static void main(String[] args) {

        BankAccount Anna = new BankAccount();

        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;

        Anna.checkingBalance();
        Anna.deposit(20);


        Anna.checkingBalance();

        Anna.withDraw(25);

        Anna.checkingBalance();

        System.out.println("==================================================================");

        System.out.println(Anna);





    }
}
