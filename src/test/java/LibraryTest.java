import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;


    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("BookCode", "Code Guru", "Education" );
        book2 = new Book("Codex", "Neo Bambam", "Education" );
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(0, library.hasBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book2);
        assertEquals(1, library.countBook());
    }
}


