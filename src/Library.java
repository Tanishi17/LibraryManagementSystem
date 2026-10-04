package src;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isIssued()) {
                    System.out.println("Book is already issued.");
                } else {
                    book.setIssued(true);
                    System.out.println("Book issued successfully!");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(String title) {

    for (Book book : books) {

        if (book.getTitle().equalsIgnoreCase(title)) {

            if (book.isIssued()) {
                book.setIssued(false);
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Book was not issued.");
            }

            return;
        }
    }

    System.out.println("Book not found.");
}

public void searchBook(String title) {

    for (Book book : books) {

        if (book.getTitle().equalsIgnoreCase(title)) {

            System.out.println("Book found!");
            System.out.println(book);
            return;
        }
    }

    System.out.println("Book not found.");
}

public void removeBook(int id) {

    for (Book book : books) {

        if (book.getId() == id) {

            if (book.isIssued()) {
                System.out.println("Cannot remove an issued book.");
            } else {
                books.remove(book);
                System.out.println("Book removed successfully!");
            }

            return;
        }
    }

    System.out.println("Book not found.");
}
}
