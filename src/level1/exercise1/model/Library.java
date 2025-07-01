package level1.exercise1.model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryBooks;

    public Library() {
        this.libraryBooks = new ArrayList<>();
    }

    public ArrayList<Book> getLibraryBooks() {
        return libraryBooks;
    }

    @Override
    public String toString() {
        return "Book list: " +  this.getLibraryBooks();
    }

    public void addBooksToTheLibrary(Book book) {
        for(Book b : libraryBooks) {
            if(b.getTitle().equalsIgnoreCase(book.getTitle())) {
                return;
            }
        }
        libraryBooks.add(book);
    }

    public void gettBookTitle(int position) {
        try {
            if (libraryBooks.size() >= position) {
                System.out.println(libraryBooks.get(position).getTitle());
            }
        } catch (Exception e) {
            System.out.println("There aren't that many books in the library");
        }
    }

    public void addBooksToTheLibraryPosition(Book book, int position) {
        try {
            if (libraryBooks.size() >= position) {
                libraryBooks.add(position, book);
            }
        } catch (Exception e) {
            System.out.println("There aren't that many books in the library");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < libraryBooks.size(); i++) {
            if (libraryBooks.get(i).getTitle().equalsIgnoreCase(title)) {
                libraryBooks.remove(i);
            }
        }
        System.out.println("The book with the title " + title + " has been removed");
    }

}
