package Training.OOP;

// this is file to practice classes and objects 



public class ClassesAndObjects {
    // Book class definition
    public static class Book {
        private String title;
        private String author;
        private String isbn;
        private double price;

        // Constructor to initialize the attributes
        public Book(String title, String author, String isbn, double price) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.price = price;
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Price: $" + price);
        }

        // Method to apply a discount to the book price
        public void applyDiscount(double discountPercentage) {
            if (discountPercentage > 0 && discountPercentage <= 100) {
                price -= price * (discountPercentage / 100);
                System.out.println("Discount applied. New price: $" + price);
            } else {
                System.out.println("Invalid discount percentage");
            }
        }
    }

    // Main method to demonstrate creating and using Book objects
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99);
        Book book2 = new Book("1984", "George Orwell", "9780451524935", 8.99);

        // Display book details
        System.out.println("Book 1 Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
        System.out.println();

        // Apply discount to book prices
        book1.applyDiscount(15);
        book2.applyDiscount(20);

        // Display book details after discount
        System.out.println();
        System.out.println("Book 1 Details After Discount:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Book 2 Details After Discount:");
        book2.displayDetails();
    }
}