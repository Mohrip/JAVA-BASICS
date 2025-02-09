package InDepth.Section8;

public class Polymorphism {

    private String title;
    private String author;

    public Polymorphism(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    class Book extends Polymorphism {
        private int pages;

        public Book(String title, String author, int pages) {
            super(title, author);
            this.pages = pages;
        }

        public void display() {
            super.display();
            System.out.println("Pages: " + pages);
            System.out.println("" + title + " by " + author + " has " + pages + " pages.");
        }
    }

    public static void main(String[] args) {
        Polymorphism book = new Polymorphism("Java for Beginners", "John Doe");
        book.display();
    }
   
}