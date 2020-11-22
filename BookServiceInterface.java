import java.util.Map;

public interface BookServiceInterface {
    public Book getById(long id);
    public String delete(long id);
    public Map<Long, Book> showBook();
    public Book addBook(String bookName, String authorName);
    public Book updateBook(Book book);
}
