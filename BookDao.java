import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class BookDao implements BookServiceInterface {
    private BookCatalog bookCatalog;

    public BookDao(BookCatalog bookCatalog) {
        this.bookCatalog = bookCatalog;
    }

    public Book getById(long id) {
        Book book = bookCatalog.getBooks().get(id);
        return book;

    }


    public void delete(long id) {
        bookCatalog.getBooks().remove(id); }

    public Map<Long, Book> getAllBooks() {
        Map book = bookCatalog.getBooks();
        return book;
    }

    public Long createId() {
        Set<Long> ides = bookCatalog.getBooks().keySet();
        Long max = Collections.max(ides);
        return max + 1;
    }

    public Book addBook(String bookName, String authorName) {
        Map<Long, Book> books = bookCatalog.getBooks();
        books.put(createId(), new Book(createId(), bookName, authorName));
        return books.get((createId()-1));
    }

    public Book updateBook(Book book) {
        Long id = book.getId();
        bookCatalog.getBooks().put(id,book);
        return bookCatalog.getBooks().put(id, book);
    }

}




