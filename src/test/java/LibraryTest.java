import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;


    @Before
    public void before() {
        library = new Library("Booktopia", 3);
        book1 = new Book("BookCode", "Code Guru", "Education");
        book2 = new Book("Codex", "Neo Bambam", "Education");
        book3 = new Book("Codio", "Fred Flintstone", "Education");
        book4 = new Book("Codeclan", "Solid Jim", "Education");
    }

    @Test
    public void numberOfBooksInLibrary() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibrary() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void stockCapacityFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.countBooks()); //why does this pass?
    }

    @Test
    public void stockCapacityOkayAddBooks(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());

    }

}


