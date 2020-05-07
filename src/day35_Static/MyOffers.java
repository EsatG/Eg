package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    /*
     Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
     */

    public static void main(String[] args) {

        Offer offer1 = new Offer();
            offer1.setOfferInfo("VA","BOA",120000,true);

        Offer offer2 = new Offer();
            offer2.setOfferInfo("CT","CapitalOne",140000,false);

        Offer offer3 = new Offer();
            offer3.setOfferInfo("CA","Apple",160000,true);

        Offer offer4 = new Offer();
            offer4.setOfferInfo("NY","Walmart",100000,true);

        Offer offer5 = new Offer();
            offer5.setOfferInfo("FL","CVS",95000,false);

            Offer [] offers = {offer1, offer2, offer3, offer4, offer5};

            String myLocation = "CA";

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
        Accept.removeIf(p-> p.salary < 100000 || !p.isFullTime || !p.location.equals(myLocation) );  // !p.isFullTime means p.isFullTime == false

        System.out.println(Accept.size());

        for (Offer each: Accept){
            System.out.println(each);
        }









    }













}
