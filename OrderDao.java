import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class OrderDao implements OrderDaoInterface{
    private OrderCatalog orderCatalog;
    private ClientCatalog clientCatalog;
    private BookCatalog bookCatalog;

    public OrderDao(OrderCatalog orderCatalog, ClientCatalog clientCatalog, BookCatalog bookCatalog) {
        this.orderCatalog = orderCatalog;
        this.clientCatalog = clientCatalog;
        this.bookCatalog = bookCatalog;
    }

    public Long createId() {
        Set<Long> ides = orderCatalog.getOrder().keySet();
        Long max = Collections.max(ides);
        return max + 1;
    }

    public Order addOrder(long bookID, long clientID) {
        Client client = clientCatalog.getClient().get(clientID);
        Book book = bookCatalog.getBooks().get(bookID);
        Map<Long, Order> order = orderCatalog.getOrder();
        order.put(createId(), new Order(createId(), book, client));
        return order.get(createId()-1);
    }
    public Order getById(long id){
        Order order = (Order) orderCatalog.getOrder().get(id);
         return order;
    }
    public void delete(long id){
        orderCatalog.getOrder().remove(id);
    }
    public Map<Long, Order> getOrders(){
        Map<Long, Order> order = orderCatalog.getOrder();
        return order;
    }
    public Order updateOrder(long orderId, long bookId, long clientId) {
        Client client = clientCatalog.getClient().get(clientId);
        Book book = bookCatalog.getBooks().get(bookId);
        orderCatalog.getOrder().put(orderId, new Order(orderId, book, client));
        return (Order) orderCatalog.getOrder().get(orderId);
    }
}
