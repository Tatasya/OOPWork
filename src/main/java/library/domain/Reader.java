package library.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Family on 11/29/2015.
 */
public class Reader {

    final static int BOOKS_LIMIT = 3;
    private int readerId;
    private String readerName;
    private boolean readerStatus;
    private Map readerBooks = new HashMap(BOOKS_LIMIT);

    public Reader(int readerId, String readerName) {
        this.readerId = readerId;
        this.readerName = readerName;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public boolean isReaderStatus() {
        return readerStatus;
    }

    public void setReaderStatus(boolean readerStatus) {
        this.readerStatus = readerStatus;
    }

    public Map getReaderBooks() {
        return readerBooks;
    }

    public void setReaderBooks(Map readerBooks) {
        this.readerBooks = readerBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader)) return false;

        Reader reader = (Reader) o;

        if (readerId != reader.readerId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return readerId;
    }
}
