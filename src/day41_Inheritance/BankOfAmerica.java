package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {
        BankAccount Esat = new BankAccount("Esat","Gorgun");

        System.out.println( Esat.getAccountHolder() );
        System.out.println(Esat.getBalance());

        Esat.checkBalance();
        Esat.depositing(120);
        Esat.checkBalance();
        Esat.withdrawing(80);
        Esat.checkBalance();

        System.out.println(Esat);
        System.out.println(Esat.getBalance());


    }
}
