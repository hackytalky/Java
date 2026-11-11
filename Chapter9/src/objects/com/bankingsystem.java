package objects.com;

import java.util.*;

class Books {
    private int id;
    private String title;
    private String author;


    Books(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
  
}

public class bankingsystem {
    static final int MAX_BOOKS = 50;

    public static void printMenu() {
        System.out.println();
        System.out.println("===== MINI LIBRARY SYSTEM =====");
        System.out.println("1. Add a new book");
        System.out.println("2. Display ALl Books");
        System.out.println("3. Quit");
        System.out.print("Enter your choice: ");
    }
    public static void displayAllBooks(Books[] library, int count) {
        if (count == 0) {
            System.out.println("No books yet.");
            return;
        }

        System.out.println();
        System.out.printf("%-8s %-20s %-12s%n", "ID", "Book Title", "Author");
        System.out.println("-".repeat(42));
        for (int i = 0; i < count; i++) {
            System.out.printf("%-8d %-20s %-12s%n",
                    library[i].getId(),
                    library[i].getTitle(),
                    library[i].getAuthor());
        }
    }
    public static Books addBook(Scanner input) {
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine(); // clear leftover newline

        System.out.print("Enter Book Title: ");
        String title = input.nextLine();

        System.out.print("Enter Book Author: ");
        String author = input.nextLine();

        return new Books(id, title, author);
    }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Books[] library = new Books[MAX_BOOKS];
        int bookCount = 0;
        int choice;

        do {
            printMenu();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    if (bookCount == library.length) {
                        System.out.println("Library is full, cannot add a new book.");
                    } else {
                        library[bookCount] = addBook(input);
                        bookCount++;
                        System.out.println("Book was saved successfully.");
                    }
                    break;
                    
                case 2:
                	displayAllBooks(library,bookCount);
                	break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        input.close();
    }
}