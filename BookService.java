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

    public String delete(long id) {

        return bookServiceInterface.delete(id);
    }

    public Map<Long, Book> showBook() {
        return bookServiceInterface.showBook();
    }

    public Book addBook(String bookName, String authorName) {
        return bookServiceInterface.addBook(bookName, authorName);
    }

    public Book updateBook(Book book) {
        return bookServiceInterface.updateBook(book);
    }

}


