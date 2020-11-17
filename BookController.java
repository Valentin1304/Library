import java.util.List;
import java.util.Map;

public class BookController {


    private BookServiceInterface bookServiceInterface;

    public BookController(BookServiceInterface bookServiceInterface) {
        this.bookServiceInterface = bookServiceInterface;
    }

    public Book getById(long id) {

        return bookServiceInterface.getById(id);

    }

    public Map<Long, Book> delete(long id) {
        return bookServiceInterface.delete(id);
    }

    public Map<Long, Book> showBook() {
        return bookServiceInterface.showBook();
    }


    public Map<Long, Book> addBook(String bookName, String authorName) {
        return bookServiceInterface.addBook(bookName, authorName);
    }

    public Book updateBook(long id, String bookName, String authorName) {
        Book book = new Book(id,bookName,authorName);
        return bookServiceInterface.updateBook(book);
    }
}

