 //Abdulelah Mohammed Mohammed AHmed
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class LibraryMember {
    private String name;
    private int id;

    public LibraryMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class User extends LibraryMember {
    public User(String name, int id) {
        super(name, id);
    }

    public void viewBooks(List<Book> books) {
        System.out.println("the books in the library are :");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

class Admin extends LibraryMember {
    public Admin(String name, int id) {
        super(name, id);
    }

    public void addBook(List<Book> books, Book newBook) {
        books.add(newBook);
        System.out.println("Book was added!! ");
    }

    public void deleteBook(List<Book> books, Book bookToDelete) {
        books.remove(bookToDelete);
        System.out.println("Book was deleted!! ");
    }

    public void viewBooks(List<Book> books) {
        System.out.println("Books in the library are:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre;
    }
}

public class Second_question {
    public static void main(String[] args) {
        List<Book> libraryBooks = new ArrayList<>();

        libraryBooks.add(new Book("Palestinian resistance", "Abdulelah Ahmed", "HAMAS"));
        libraryBooks.add(new Book("Palestinian resistance", "Abdulelah Ahmed", "Islamic Jihad movement"));

                      User user = new User("Abo Obaydah", 7/10);
                    Admin admin = new Admin("Abo Hamza", 11/11);

        user.viewBooks(libraryBooks);

        Book newBook = new Book("Yemen loves Palestine", "Abdulelah", "Resistance movement");
        admin.addBook(libraryBooks, newBook);

        admin.viewBooks(libraryBooks);

        admin.deleteBook(libraryBooks, libraryBooks.get(0));

        admin.viewBooks(libraryBooks);
    }
}
