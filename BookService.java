import java.util.List;
import java.util.Map;

public class BookService implements BookServiceInterface {

    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book getById(long id) {

        Book result = bookDao.getById(id);
        if (result == null) {
            throw new IllegalArgumentException("Cannot find book with this ID" + id);
        }
        return result;
    }

    public Map<Long, Book> delete(long id) {

        return bookDao.delete(id);
    }

    public Map<Long, Book> showBook() {
        return bookDao.showBook();
    }

    public Map<Long, Book> addBook(String bookName, String authorName) {
        return bookDao.addBook(bookName, authorName);
    }

    public Book updateBook(Book book) {
        return bookDao.updateBook(book);
    }

}


