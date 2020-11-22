import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class OrderDao {
    private OrderCatalog orderCatalog;
    private ClientCatalog clientCatalog;
    private BookCatalog bookCatalog;

    public OrderDao(OrderCatalog orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

    public Long createId() {
        Set<Long> longs = orderCatalog.getOrder().keySet();
        Long max = Collections.max(longs);
        return max + 1;
    }

    public Map<Long, Order> addOrder(long bookID, long clientID) {
        Client client = clientCatalog.getClient().get(clientID);
        Book book = bookCatalog.getBooks().get(bookID);
        Map<Long, Order> order = orderCatalog.getOrder();
        order.put(createId(), new Order(createId(), book, client));
        return orderCatalog.getOrder();
    }
}
