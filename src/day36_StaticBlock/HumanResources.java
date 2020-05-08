package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

    static {
        dev1.setInfo("Esat","Developer",150000,123);
        dev2.setInfo("Omer","Developer",160000,564);
    }








}
