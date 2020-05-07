package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Esat",123456, "QA",200000);

        Tester tester2 =new Tester();
        tester2.setTesterInfo("Andi",12556,"SDET",150000);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Yucel",545641,"Senior SDET",120000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Muhtar",56810,"Manual Tester",130000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("John",4455,"Uber Driver",60000);

        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        testers.removeIf(p-> !p.jobTitle.contains("SDET"));

        double totalBudget = 0;
        for (Tester each : testers){
            System.out.println(each);
            totalBudget += each.salary;
        }
        System.out.println(totalBudget);











    }
}
