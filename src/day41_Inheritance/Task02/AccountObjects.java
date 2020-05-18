package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Esat";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();
        System.out.println(obj);

        obj.withdraw(10000);
        obj.showBalance();
        System.out.println(obj);

        System.out.println("===================================================================");

        SavingAccount saving = new SavingAccount();
        saving.accountHolder = "Elif";

        System.out.println(saving.interestRate);  // also we can call by class name=>> ( SavingAccount.interestRate)

        System.out.println(saving);

        saving.deposit(3000);
        saving.showBalance();

    }
}
