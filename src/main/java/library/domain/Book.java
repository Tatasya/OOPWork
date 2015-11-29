package library.domain;

import java.util.Date;

/**
 * Created by Family on 11/29/2015.
 */
public class Book {

    private int bookId;
    private String bookName;
    private Date bookBirth;
    private String bookAuthor;

    public Book(int bookId, String bookName, Date bookBirth, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookBirth = bookBirth;
        this.bookAuthor = bookAuthor;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBookBirth() {
        return bookBirth;
    }

    public void setBookBirth(Date bookBirth) {
        this.bookBirth = bookBirth;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("bookId=").append(bookId);
        sb.append(", bookName='").append(bookName).append('\'');
        sb.append(", bookBirth=").append(bookBirth);
        sb.append(", bookAuthor='").append(bookAuthor).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (bookId != book.bookId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return bookId;
    }
}
