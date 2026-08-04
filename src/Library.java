package src;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");

}

public void viewBooks() {

    System.out.println("DEBUG: Inside viewBooks()");

    if (books.isEmpty()) {
    System.out.println("Library is empty.");
    return;
}

for (Book book : books) {
        System.out.println(book);
        System.out.println("-------------------------");
    }

}
    
}
