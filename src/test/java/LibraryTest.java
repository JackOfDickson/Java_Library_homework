import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Animal Farm", "George Orwell", "fable");
        book1 = new Book("I am Legend", "Richard Matheson", "horror");
        book2 = new Book("The Big Book of Funnies", "Mr Funny", "comedy");
        book3 = new Book("Divine Comedy", "Dante Alighieri", "poetry");


    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRejectBooksBeyondCapacity(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookCount());
    }
}
