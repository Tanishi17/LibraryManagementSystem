import java.util.Scanner;

import src.Book;
import src.Library;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        
        while (true) {

    System.out.println("\n===== Library Management System =====");
    System.out.println("1. Add Book");
    System.out.println("2. View Books");
    System.out.println("3. Exit");

    System.out.print("Enter your choice: ");

    int choice = sc.nextInt();
    System.out.println("You entered: " + choice);

    switch (choice) {

    case 1:
        System.out.print ("Enter Book ID: ");
        System.out.println("DEBUG: New code is running");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();

        Book book = new Book(id, title, author);

        library.addBook(book);

        break;

    case 2:
        System.out.println("Reached Case 2");
        library.viewBooks();
        break;

    case 3:
        System.out.println("Thank you!");
        sc.close();
        return;

    default:
        System.out.println("Invalid Choice");
}

}
    }
} 
