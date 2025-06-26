package level1.exercise1.application;

import level1.exercise1.model.Book;
import level1.exercise1.model.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Game of Thrones");
        Book book2 = new Book("The Hobbit");
        Book book3 = new Book("Harry Potter and the Sorcerer's Stone");
        Book book4 = new Book("Little Women");
        Book book5 = new Book("The Midnight Library");

        Library library1 = new Library();

        library1.addBooksToTheLibrary(book1);
        library1.addBooksToTheLibrary(book2);

        System.out.println("Library inventory");
        for (Book actualBook : library1.getLibraryBooks()) {
            System.out.println("- " + actualBook.getTitle());
        }

        System.out.println("------------------------------");

        library1.addBooksToTheLibraryPosition(book3,1);

        System.out.println("Library inventory");
        for (Book actualBook : library1.getLibraryBooks()) {
            System.out.println("- " + actualBook.getTitle());
        }

        library1.addBooksToTheLibrary(book4);
        library1.addBooksToTheLibrary(book5);

        System.out.println("------------------------------");

        library1.gettBookTitle(2);

        System.out.println("------------------------------");

        library1.removeBook("'Harry Potter and the Sorcerer's Stone'");

    }
}
