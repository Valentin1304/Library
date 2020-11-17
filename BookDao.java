import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class BookDao {
    private BookCatalog bookCatalog;

    public BookDao(BookCatalog bookCatalog) {
        this.bookCatalog = bookCatalog;
    }

    public Book getById(long id) {
        Book book = bookCatalog.getBooks().get(id);
        return book;

    }


    public Map<Long, Book> delete(long idd) {
        bookCatalog.getBooks().remove(idd);
        Map<Long, Book> book = bookCatalog.getBooks();
        return book;

    }

    public Map<Long, Book> showBook() {
        Map book = bookCatalog.getBooks();
        return book;
    }

    public Long createId() {
        Set<Long> longs = bookCatalog.getBooks().keySet();
        Long max = Collections.max(longs);
        return max + 1;
    }

    public Map<Long, Book> addBook(String bookName, String authorName) {
        Map<Long, Book> books = bookCatalog.getBooks();
        books.put(createId(), new Book(createId(), bookName, authorName));
        return bookCatalog.getBooks();
    }

    public Book updateBook(Book book) {
        Long id = book.getId();
        bookCatalog.getBooks().put(id,book);
        return bookCatalog.getBooks().put(id,book);
    }

}




