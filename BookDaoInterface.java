import java.util.Map;

public interface BookDaoInterface {
    public Book getById(long id);
    public void delete(long id);
    public Map<Long, Book> getAllBooks();
    public Book addBook(String bookName, String authorName);
    public Book updateBook(Book book);
}

