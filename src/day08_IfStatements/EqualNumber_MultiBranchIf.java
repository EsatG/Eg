package day08_IfStatements;

/* write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal  */

public class EqualNumber_MultiBranchIf {
    public static void main(String[] args) {

        double n1 = 200;
        double n2 = 200;
        double n3 = 20;

        boolean n1Equaln2 = n1 == n2 && n1!=n3;
        boolean n1Equaln3 = n1 == n3 && n1 != n2;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean  allEqual = n1 == n2 && n1==n3;


        //boolean noneEqual = n1Equaln2==false && n1Equaln3==false && n2Equaln3==false;
        // boolean noneEqual = !n1Equaln2 && !n1Equaln3 && !n2Equaln3

        String result = " ";

        if (n1Equaln2){
           // System.out.println("n1 = n2");
            result = "n1 = n2";
        }
        else if (n1Equaln3){
            // System.out.println("n1 = n3");
            result = "n1 =n3";
        }
        else if (n2Equaln3){
            // System.out.println("n2 = n3");
            result = "n2 = n3";
        }
        else if (allEqual){
            // System.out.println("n1 = n2 = n3");
            result = "n1 = n2 = n3";
        }
        else{
            // System.out.println("n1 != n2 != n3");
            result = "n1 != n2 != n3";
        }
        System.out.println(result);
    }
}
