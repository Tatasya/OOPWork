package library.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Family on 11/29/2015.
 */
public class Library {
    private String name;
    private Map<Integer, Reader> listOfReaders;
    private Map<Integer, Reader> listOfBlackMarkReaders;
    private Map<Integer, Book> listOfAvailableBooks;
    private Map<Integer, Book> listOfTakenBooks;

    public Library(String name) {
        this.name = name;
        listOfReaders = new HashMap();
        listOfBlackMarkReaders = new HashMap();
        listOfAvailableBooks = new HashMap();
        listOfTakenBooks = new HashMap();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getListOfTakenBooks() {
        return listOfTakenBooks;
    }

    public void setListOfTakenBooks(Map listOfTakenBooks) {
        this.listOfTakenBooks = listOfTakenBooks;
    }

    public Map getListOfBlackMarkReaders() {
        return listOfBlackMarkReaders;
    }

    public void setListOfBlackMarkReaders(Map listOfBlackMarkReaders) {
        this.listOfBlackMarkReaders = listOfBlackMarkReaders;
    }

    public Map getListOfReaders() {
        return listOfReaders;
    }

    public void setListOfReaders(Map listOfReaders) {
        this.listOfReaders = listOfReaders;
    }

    public Map getListOfAvailableBooks() {
        return listOfAvailableBooks;
    }

    public void setListOfAvailableBooks(Map listOfAvailableBooks) {
        this.listOfAvailableBooks = listOfAvailableBooks;
    }


}
