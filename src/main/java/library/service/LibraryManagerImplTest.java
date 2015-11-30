package library.service;

import library.domain.Book;
import library.domain.Library;
import library.domain.Reader;
import library.exception.NullBookException;
import library.exception.NullReaderException;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class LibraryManagerImplTest {

    private static Library library;
    private static LibraryManagerImpl libraryManager;
    private static final Logger LOGGER = Logger.getLogger(LibraryManager.class);
    private static Book mockBook;
    private static Reader mockReader;


    @BeforeClass
    public static void initItems() {
        library = new Library("Test Library");
        libraryManager = new LibraryManagerImpl(library);
        mockBook = mock(Book.class);
        mockReader = mock(Reader.class);


    }

    @Test
    public void testGetListOfReaders() throws Exception {
        libraryManager.getListOfReaders().put(1,mockReader);
        libraryManager.getListOfReaders().put(2,mockReader);
        libraryManager.getListOfReaders().put(3,mockReader);
        libraryManager.getListOfReaders().put(4,mockReader); // one extra put in test below
        assertEquals(5, libraryManager.getListOfReaders().size());

    }

    @Test
    public void testGetListOfAvailableBooks() throws Exception {
        libraryManager.getListOfAvailableBooks().put(1,mockBook);
        libraryManager.getListOfAvailableBooks().put(2,mockBook);
        assertEquals(2, libraryManager.getListOfAvailableBooks().size());

    }

    @Test (expected = NullBookException.class)
    public void testAddBooksToLibrary() throws Exception {
        libraryManager.addBooksToLibrary(mockBook);
        assertEquals(true, libraryManager.getListOfAvailableBooks().containsKey(mockBook.getBookId()));
        Book book2 = null;
        libraryManager.addBooksToLibrary(book2);
    }

    @Test(expected = NullReaderException.class)
    public void testAddReaderToLibrary() throws Exception {
         libraryManager.addReaderToLibrary(mockReader);
         assertEquals(true, libraryManager.getListOfReaders().containsKey(mockReader.getReaderId()));
         Reader reader = null;
         libraryManager.addReaderToLibrary(reader);

    }

    @Test
    public void testGiveBookToReader() throws Exception {
        libraryManager.giveBookToReader(mockBook,mockReader);
        assertEquals(false,mockReader.getReaderBooks().containsKey(mockBook.getBookId())); //as no such of books

    }

    @Test
    public void testGetListOfTakenBooks() throws Exception {

    }

    @Test
    public void testGetReadersBooks() throws Exception {

    }

    @Test
    public void testAddReaderToBlackList() throws Exception {

    }
}