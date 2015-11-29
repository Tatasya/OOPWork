package library.service;

import library.domain.Book;
import library.domain.Reader;
import library.exception.NullBookException;
import library.exception.NullReaderException;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Family on 11/29/2015.
 */
public interface LibraryManager {

    /*
     1) посмотреть список читателей
     2) посмотреть список доступных книг
     3) добавить книгу в библиотеку
     4) добавить читателя в список читателей
     5) выдать книгу читателю (если книга есть в наличии).
        Читателю запрещается брать больше 3-х книг.
     6) посмотреть список книг, которые находятся у читателей
     7) посмотреть список книг, которые находятся у конкретного читателя
     8) добавить читателя в черный список (ему нельзя выдавать книги)
     9) посмотреть книги конкретного автора
     10) посмотреть новые книги (год издания выше 2013)*/

    public Map getListOfReaders();
    public Map getListOfAvailableBooks();
    public Book addBooksToLibrary(Book book) throws NullBookException;
    public Reader addReaderToLibrary(Reader reader) throws NullReaderException;
    public Book giveBookToReader(Book book, Reader reader) throws NullReaderException, NullBookException;
    public Map getListOfTakenBooks();
    public Map getReadersBooks(Reader reader) throws NullReaderException;
    public boolean addReaderToBlackList(Reader reader) throws NullReaderException;
    public List<Book> getBooksByAuthor(String authorName);
    public List<Book> getBooksByDate(Date start, Date finish);



}
