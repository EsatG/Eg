package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock2 {
    static int a;
    static int b;
    int c;

    static Tester tester1 = new Tester();

    public static void main(String[] args) {

        System.out.println(tester1);
    }

    static {
        a = 100;
        b = 200;
       // c = 300;  compile error since static only accepts static

        if (100 > 200){
            a = 100;
        } else {
            b = 200;
        }

        tester1.setTesterInfo("Esat",123,"QA",100000);
    }












}
