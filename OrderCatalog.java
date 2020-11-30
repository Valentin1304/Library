import java.util.HashMap;
import java.util.Map;

public class OrderCatalog {

   private BookCatalog bookCatalog = new BookCatalog();
   private ClientCatalog clientCatalog = new ClientCatalog();

    private Map<Long, Order> order = new HashMap<>(){{
        this.put(1L, new Order(1L, bookCatalog.book1, clientCatalog.client1));
        this.put(2L, new Order(2L, bookCatalog.book2, clientCatalog.client3));
        this.put(3L, new Order(3L, bookCatalog.book3, clientCatalog.client4));
        this.put(4L, new Order(4L, bookCatalog.book4, clientCatalog.client2));


    }};

    public Map getOrder() {
        return order;
    }
}
