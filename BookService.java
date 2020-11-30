import java.util.List;
import java.util.Map;

public class BookService implements BookServiceInterface {

    private BookServiceInterface bookServiceInterface;

    public BookService(BookServiceInterface bookServiceInterface) {
        this.bookServiceInterface = bookServiceInterface;
    }

    public Book getById(long id) {

        Book result = bookServiceInterface.getById(id);
        if (result == null) {
            throw new IllegalArgumentException("Cannot find book with this ID" + id);
        }
        return result;
    }

    public void delete(long id) { bookServiceInterface.delete(id);    }

    public Map<Long, Book> getAllBooks() {
        return bookServiceInterface.getAllBooks();
    }

    public Book addBook(String bookName, String authorName) {
        return bookServiceInterface.addBook(bookName, authorName);
    }

    public Book updateBook(Book book) {
        return bookServiceInterface.updateBook(book);
    }

}


