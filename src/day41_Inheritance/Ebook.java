package day41_Inheritance;

public class Ebook extends Book{

    /*
    title   (inherited)
    author  (inherited)
    price   (inherited)
    size
    pages
    readbook()
    toString() (inherited)
     */

    public String size;
    public int pages;

    public void readbook(){
        System.out.println( "Reading " + title );
    }




}
