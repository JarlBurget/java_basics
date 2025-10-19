package week6;

import java.util.ArrayList;

public class Exercise101_Library {
    private ArrayList<Exercise101_Book> books;

    public Exercise101_Library() {
        this.books = new ArrayList<Exercise101_Book>();
    }

    public void addBook(Exercise101_Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Exercise101_Book book : books) {
            System.out.println(book);
        }
    }

    // ----- Search by title -----
    public ArrayList<Exercise101_Book> searchByTitle(String searchedTitle) {
        ArrayList<Exercise101_Book> found = new ArrayList<Exercise101_Book>();
        for (Exercise101_Book book : books) {
            if (Exercise101_StringUtils.included(book.title(), searchedTitle)) {
                found.add(book);
            }
        }
        return found;
    }

    // ----- Search by publisher -----
    public ArrayList<Exercise101_Book> searchByPublisher(String searchedPublisher) {
        ArrayList<Exercise101_Book> found = new ArrayList<Exercise101_Book>();
        for (Exercise101_Book book : books) {
            if (Exercise101_StringUtils.included(book.publisher(), searchedPublisher)) {
                found.add(book);
            }
        }
        return found;
    }

    // ----- Search by year -----
    public ArrayList<Exercise101_Book> searchByYear(int searchedYear) {
        ArrayList<Exercise101_Book> found = new ArrayList<Exercise101_Book>();
        for (Exercise101_Book book : books) {
            if (book.year() == searchedYear) {
                found.add(book);
            }
        }
        return found;
    }
}
