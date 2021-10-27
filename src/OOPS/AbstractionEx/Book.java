package OOPS.AbstractionEx;

public abstract class Book {
    String title;
    String author;


    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }



    public abstract void display();
}
