import java.util.Map;

public interface OrderServiceInterface {
    public Order addOrder(long bookID, long clientID);
    public Order getById(long id);
    public void delete(long id);
    public Map<Long, Order> getOrders();
    public Order updateOrder(long orderId, long bookId, long clientId);
}
