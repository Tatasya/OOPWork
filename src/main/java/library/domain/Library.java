package library.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Family on 11/29/2015.
 */
public class Library {
    private String name;
    private Map mapOfReaders;
    private Map mapOfBlackMarkReaders;
    private Map mapOfAvailableBooks;
    private Map mapOfTakenBooks;

    public Library(String name) {
        this.name = name;
        mapOfReaders = new HashMap();
        mapOfBlackMarkReaders = new HashMap();
        mapOfAvailableBooks = new HashMap();
        mapOfTakenBooks = new HashMap();
    }

    public Map getMapOfReaders() {
        return mapOfReaders;
    }

    public void setMapOfReaders(Map mapOfReaders) {
        this.mapOfReaders = mapOfReaders;
    }

    public Map getMapOfBlackMarkReaders() {
        return mapOfBlackMarkReaders;
    }

    public void setMapOfBlackMarkReaders(Map mapOfBlackMarkReaders) {
        this.mapOfBlackMarkReaders = mapOfBlackMarkReaders;
    }

    public Map getMapOfAvailableBooks() {
        return mapOfAvailableBooks;
    }

    public void setMapOfAvailableBooks(Map mapOfAvailableBooks) {
        this.mapOfAvailableBooks = mapOfAvailableBooks;
    }

    public Map getMapOfTakenBooks() {
        return mapOfTakenBooks;
    }

    public void setMapOfTakenBooks(Map mapOfTakenBooks) {
        this.mapOfTakenBooks = mapOfTakenBooks;
    }


}
