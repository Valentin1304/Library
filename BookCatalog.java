import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookCatalog {

    private Map<Long, Book> books = new HashMap<>() {{
        this.put(1001L, new Book(1001L, "Homodeus", "Kto"));
        this.put(1002L, new Book(1002L, "Homoeus", "Kto"));
        this.put(1003L, new Book(1003L, "Homoeus", "Kto"));
        this.put(1004L, new Book(1004L, "Homoeus", "Kto"));
    }};


    public Map<Long, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<Long, Book> books) {
        this.books = books;
    }
}




