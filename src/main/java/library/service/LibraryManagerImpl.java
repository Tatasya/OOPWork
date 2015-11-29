package library.service;

        import library.domain.Book;
        import library.domain.Library;
        import library.domain.Reader;
        import library.exception.NullBookException;
        import library.exception.NullReaderException;
        import org.apache.log4j.Logger;

        import java.util.Date;
        import java.util.List;
        import java.util.Map;

public class LibraryManagerImpl implements LibraryManager {
    private Library library;
    private static final Logger LOGGER = Logger.getLogger(LibraryManager.class);

    public LibraryManagerImpl(Library library) {
        this.library = library;
    }

    @Override
    public Map getListOfReaders() {
        return library.getListOfReaders();
    }

    @Override
    public Map getListOfAvailableBooks() {
        return library.getListOfAvailableBooks();
    }

    @Override
    public Book addBooksToLibrary(Book book) throws NullBookException {
        if (book != null) {
            library.getListOfAvailableBooks().put(book.getBookId(), book);
            return book;
        } else {
            throw new NullBookException();
        }
    }

    @Override
    public Reader addReaderToLibrary(Reader reader) throws NullReaderException {
        if (reader != null) {
            library.getListOfReaders().put(reader.getReaderId(), reader);
            return reader;
        } else {
            throw new NullReaderException();
        }
    }

    @Override
    public Book giveBookToReader(Book book, Reader reader) throws NullReaderException, NullBookException {
        if (readerExists(reader) && bookExists(book)) {
            try {
                reader.getReaderBooks().put(book.getBookId(), book);
                library.getListOfTakenBooks().put(book.getBookId(), book);
                library.getListOfAvailableBooks().remove(book);
                return book;
            } catch (IndexOutOfBoundsException ex) {
                LOGGER.error("You already have 3 books, please give one back, so you will be able to take a new one");
                return null;
            }
        } else if (!readerExists(reader) && bookExists(book)) {
            addReaderToLibrary(reader);
            return giveBookToReader(book, reader);

        } else if (!bookExists(book)) {
            LOGGER.error("No such book at the library");
        }
        return null;
    }

    @Override
    public Map getListOfTakenBooks() {
        return library.getListOfTakenBooks();
    }

    @Override
    public Map getReadersBooks(Reader reader) throws NullReaderException {
        if (reader != null) {
            return reader.getReaderBooks();
        } else {
            throw new NullReaderException();
        }
    }

    @Override
    public boolean addReaderToBlackList(Reader reader) throws NullReaderException {
        if (readerExists(reader)) {
            reader.setReaderStatus(true);
            library.getListOfBlackMarkReaders().put(reader.getReaderId(), reader);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> getBooksByAuthor(String authorName) {

        return null;
    }

    @Override
    public List<Book> getBooksByDate(Date start, Date finish) {
        return null;
    }

    private boolean readerExists(Reader reader) throws NullReaderException {
        if (reader != null) {
            return library.getListOfReaders().containsKey(reader.getReaderId());
        } else {
            throw new NullReaderException();
        }

    }

    private boolean bookExists(Book book) throws NullBookException {
        if (book != null) {
            return library.getListOfAvailableBooks().containsKey(book.getBookId());
        } else {
            throw new NullBookException();
        }
    }
}

