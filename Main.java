
import java.util.Scanner;
import src.Book;
import src.Library;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter book title: ");
                String title = sc.nextLine();

                System.out.print("Enter author name: ");
                String author = sc.nextLine();

                Book book = new Book(id, title, author);
                library.addBook(book);

            } else if (choice == 2) {

                library.viewBooks();

            } else if (choice == 3) {

                System.out.print("Enter book title to issue: ");
                String title = sc.nextLine();

                library.issueBook(title);

            } else if (choice == 4) {

                System.out.print("Enter book title to return: ");
                String title = sc.nextLine();

                library.returnBook(title);

            } else if (choice == 5) {

                System.out.print("Enter book title to search: ");
                String title = sc.nextLine();

                library.searchBook(title);

            } else if (choice == 6) {

                System.out.print("Enter book ID to remove: ");
                int id = sc.nextInt();
                sc.nextLine();

                library.removeBook(id);

            } else if (choice == 7) {

                System.out.println("Exiting Library Management System...");
                sc.close();
                break;

            } else {

                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}





