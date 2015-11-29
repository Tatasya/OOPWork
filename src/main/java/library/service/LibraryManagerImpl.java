package library.service;

import library.domain.Book;
import library.domain.Reader;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Family on 11/29/2015.
 */
public class LibraryManagerImpl implements LibraryManager {
    @Override
    public Map getListOfReaders() {
        return null;
    }

    @Override
    public Map getListOfAvailableBooks() {
        return null;
    }

    @Override
    public Book addBooksToLibrary(Book book) {
        return null;
    }

    @Override
    public Reader addReaderToLibrary(Reader reader) {
        return null;
    }

    @Override
    public Book giveBook(Book book, Reader reader) {
        return null;
    }

    @Override
    public Map getListOfTakenBooks() {
        return null;
    }

    @Override
    public Map getReadersBooks(Reader reader) {
        return null;
    }

    @Override
    public boolean addReaderToBlackList(Reader reader) {
        return false;
    }

    @Override
    public List<Book> getBooksByAuthor() {
        return null;
    }

    @Override
    public List<Book> getBooksByDate(Date start, Date finish) {
        return null;
    }
}
