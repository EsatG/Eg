package day41_Inheritance;

public class AudioBook extends Book{

    /*
    title   (inherited)
    author  (inherited)
    price   (inherited)

    length
    listen
    toString() (inherited)
     */

    public String length;

    public void listen(){
        System.out.println("Listening to " + title);
    }


}
