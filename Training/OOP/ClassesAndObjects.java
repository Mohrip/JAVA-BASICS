package Training.OOP;

public class ClassesAndObjects {

    public static class Book{
    private String title;
    private String author;
    private String isbn;
    private double price;


    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
    }

    
    
    }
    
}
