package Library_Management_System;
// Book class to represent a book in the library
class Book {
    String bookName;
    String author;
    int pages;
    float price;

    // Constructor to initialize a book
    public Book(String bookName, String author, int pages, float price) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Book name = " + bookName + "\tAuthor name = " + author + "\tPages = " + pages + "\tPrice = " + price);
    }
}

public class Lib_Management_System {
    public static void main(String[] args) {
        // Create an ArrayList to hold the books in the library
        java.util.ArrayList<Book> library = new java.util.ArrayList<>();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int input = 0;

        // Iterate the loop until the user chooses to exit
        while (input != 5) {
            System.out.println("\n\n            WELCOME TO E-LIBRARY \n");
            System.out.println("1. Add book information");
            System.out.println("2. Display book information");
            System.out.println("3. List all books of given author");
            System.out.println("4. List the count of books in the library");
            System.out.println("5. Exit");

            // Enter the user's choice
            System.out.print("\n\nEnter one of the above: ");
            input = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (input) {
                // Add book
                case 1:
                    System.out.print("Enter book name = ");
                    String bookName = scanner.nextLine();

                    System.out.print("Enter author name = ");
                    String author = scanner.nextLine();

                    System.out.print("Enter pages = ");
                    int pages = scanner.nextInt();

                    System.out.print("Enter price = ");
                    float price = scanner.nextFloat();
                    scanner.nextLine(); // Consume the newline

                    // Add the new book to the library
                    library.add(new Book(bookName, author, pages, price));
                    break;

                // Display book information
                case 2:
                    System.out.println("You have entered the following information");
                    for (Book book : library) {
                        book.displayBookInfo();
                    }
                    break;

                // List all books of a given author
                case 3:
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    for (Book book : library) {
                        if (book.author.equals(authorName)) {
                            book.displayBookInfo();
                        }
                    }
                    break;

                // List the count of books in the library
                case 4:
                    System.out.println("No. of books in Library: " + library.size());
                    break;

                // Exit
                case 5:
                    System.out.println("Exiting...");
                    break;

                // Invalid input
                default:
                    System.out.println("Please choose from the given options");
                    break;
            }
        }

        scanner.close();
    }
}
