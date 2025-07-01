package level1.exercise1.application;

import level1.exercise1.model.Book;
import level1.exercise1.model.Library;
import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class LibraryTest {

    Book book1 = new Book("Game of Thrones");
    Book book2 = new Book("The Hobbit");
    Book book3 = new Book("Harry Potter and the Sorcerer's Stone");
    Book book4 = new Book("Little Women");
    Book book5 = new Book("The Midnight Library");

    Library library = new Library();

    @Test
    public void testLibraryNotNull() throws Throwable {
        library.addBooksToTheLibrary(book1);

        assertNotNull(library);
    }

    @Test
    public void testLibrarySize() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book3);
        library.addBooksToTheLibrary(book4);
        library.addBooksToTheLibrary(book5);

        assertEquals(5,library.getLibraryBooks().size());
    }

    @Test
    public void testLibraryBookCorrectPosition() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book3);
        library.addBooksToTheLibrary(book4);
        library.addBooksToTheLibrary(book5);

        assertEquals(book4, library.getLibraryBooks().get(3));
    }

    @Test
    public void testLibraryBooksDuplicates() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book3);
        library.addBooksToTheLibrary(book4);
        library.addBooksToTheLibrary(book5);

        Set<Book> withoutDuplicates = new HashSet<>(library.getLibraryBooks());

        assertEquals(library.getLibraryBooks().size(), withoutDuplicates.size());
    }

    @Test
    public void testGetTitleBookLibraryPosition() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book3);
        library.addBooksToTheLibrary(book4);
        library.addBooksToTheLibrary(book5);

        assertEquals(book5.getTitle(), library.getLibraryBooks().get(4).getTitle());
    }

    @Test
    public void testAddBookLibrary() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book3);

        List<Book> aux = List.copyOf(library.getLibraryBooks());

        library.addBooksToTheLibrary(book4);
        library.addBooksToTheLibrary(book5);

        assertNotEquals(library.getLibraryBooks().size(), aux.size());
    }

    @Test
    public void testRemoveBookLibrary() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book3);

        List<Book> aux = List.copyOf(library.getLibraryBooks());

        library.getLibraryBooks().remove(2);

        assertNotEquals(library.getLibraryBooks().size(), aux.size());
    }

    @Test
    public void testAlphabeticallyArrangedLibrary() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book3);
        library.addBooksToTheLibrary(book4);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book5);

        ArrayList<String> bookTitles = new ArrayList<>();

        for(Book book : library.getLibraryBooks()) {
            bookTitles.add(book.getTitle());
        }

        Collections.sort(bookTitles);

        boolean aux = true;
        for(int i = 0; i < library.getLibraryBooks().size(); i++) {
            if(!bookTitles.get(i).equalsIgnoreCase(library.getLibraryBooks().get(i).getTitle())) {
                aux = false;
            }
        }

        assertTrue(aux);
    }

    @Test
    public void testListSortAfterDeleteBook() throws Throwable {
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(book3);
        library.addBooksToTheLibrary(book4);
        library.addBooksToTheLibrary(book2);
        library.addBooksToTheLibrary(book5);

        library.getLibraryBooks().remove(2);

        ArrayList<String> bookTitles = new ArrayList<>();

        for(Book book : library.getLibraryBooks()) {
            bookTitles.add(book.getTitle());
        }

        Collections.sort(bookTitles);

        boolean aux = true;
        for(int i = 0; i < library.getLibraryBooks().size(); i++) {
            if(!bookTitles.get(i).equalsIgnoreCase(library.getLibraryBooks().get(i).getTitle())) {
                aux = false;
            }
        }

        assertTrue(aux);
    }

}

