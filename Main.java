import java.util.Scanner;

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

    switch (choice) {

    case 1:
        System.out.println("Add Book selected");
        break;

    case 2:
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
