import java.util.Map;

public interface BookServiceInterface {
    public Book getById(long id);
    public Map<Long, Book> delete(long id);
    public Map<Long, Book> showBook();
    public Map<Long, Book> addBook(String bookName, String authorName);
    public Book updateBook(Book book);
}
