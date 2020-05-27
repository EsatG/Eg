package Repl.it;

public class Book {

    public String title;
    public String author;
    public String tableOfContents = "";

    public int nextPage = 1;

    public Book(String title, String author){

        this.title = title;
        this.author = author;
    }

    public void addChapter(String chapter, int pages){


        tableOfContents += "\n" + chapter + "..."  + nextPage;

        nextPage += pages;



    }

    public int getPages(){
        return nextPage - 1;
    }

    public String getTableOfContents(){
        return tableOfContents;
    }

    public String toString(){
        return title + "\n" + author;
    }


}

class Object{
    public static void main(String[] args) {

        Book obj = new Book("Lemalar", "Bediuzzaman");

    obj.addChapter("Lemalar",320);

        System.out.println(obj.nextPage);

        System.out.println(obj.tableOfContents);

        System.out.println(obj);

        System.out.println(obj.getPages());

        System.out.println("Hello World!");
    }

}
