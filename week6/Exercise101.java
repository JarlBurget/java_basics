package week6;

import java.util.ArrayList;

public class Exercise101 {
    public static void main(String[] args) {
        Exercise101_Library library = new Exercise101_Library();

        library.addBook(new Exercise101_Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        library.addBook(new Exercise101_Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        library.addBook(new Exercise101_Book("NHL Hockey", "Stanley Kupp", 1952));
        library.addBook(new Exercise101_Book("Battle Axes", "Tom A. Hawk", 1851));

        // --- search by title ---
        System.out.println("Search by title 'CHEESE':");
        ArrayList<Exercise101_Book> result = library.searchByTitle("CHEESE");
        for (Exercise101_Book book : result) {
            System.out.println(book);
        }

        System.out.println("---");

        // --- search by publisher ---
        System.out.println("Search by publisher 'PENGUIN  ' (with spaces):");
        result = library.searchByPublisher("PENGUIN  ");
        for (Exercise101_Book book : result) {
            System.out.println(book);
        }

        System.out.println("---");

        // --- search by year ---
        System.out.println("Search by year 1851:");
        result = library.searchByYear(1851);
        for (Exercise101_Book book : result) {
            System.out.println(book);
        }
    }
}