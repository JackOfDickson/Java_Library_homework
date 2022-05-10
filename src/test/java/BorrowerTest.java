import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(3);
        book = new Book("Animal Farm", "George Orwell", "fable");
        book1 = new Book("I am Legend", "Richard Matheson", "horror");
        book2 = new Book("The Big Book of Funnies", "Mr Funny", "comedy");
        book3 = new Book("Divine Comedy", "Dante Alighieri", "poetry");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBook(book);
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBook(library, book);


    }


}
