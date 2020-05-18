package day41_Inheritance;

public class BooksObjects {
    public static void main(String[] args) {

        Ebook book1 = new Ebook();

        book1.title = "A Murder is Announced";
        book1.author= "Agatha Christie";
        book1.price = 20;
        book1.size = "1.5 MB";
        book1.pages = 150;

        System.out.println(book1);
        System.out.println("Size: " + book1.size);
        System.out.println("Pages: " + book1.pages);

        book1.readbook();

        System.out.println("=============================================================");

        AudioBook audio = new AudioBook();

        audio.title = "Hamlet";
        audio.author = "Shakespere";
        audio.price = 15.5;
        audio.length = "19 hours and 3 minutes";

        System.out.println(audio);
        System.out.println("Length of the auido book \""+ audio.title + "\" is " + audio.length );

        audio.listen();

    }
}
