import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookCatalog {
    Book book1 = new Book(1001L, "Homodeus", "Kto");
    Book book2 = new Book(1002L, "Homoeus", "Kto");
    Book book3 = new Book(1003L, "Homoeus", "Kto");
    Book book4 = new Book(1004L, "Homoeus", "Kto");

  private Map<Long, Book> books = new HashMap<>() {{
        this.put(1001L, book1);
        this.put(1002L, book2);
        this.put(1003L, book3);
        this.put(1004L, book4);
    }};



    public Map<Long, Book> getBooks() {
        return books;
    }

}




