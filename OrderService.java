import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderService implements OrderServiceInterface {

    private OrderDaoInterface orderDaoInterface;

    public OrderService(OrderDaoInterface orderDaoInterface) {
        this.orderDaoInterface = orderDaoInterface;
    }

    public Order addOrder(long bookID, long clientID) {
        return orderDaoInterface.addOrder(bookID, clientID);
    }
    public Order getById(long id){
        return orderDaoInterface.getById(id);
    }
    public void delete(long id){
        orderDaoInterface.delete(id);
    }
    public Map<Long,Order> getOrders(){
        return orderDaoInterface.getOrders();
    }
    public Order updateOrder(long orderId, long bookId, long clientId){
        return orderDaoInterface.updateOrder(orderId,bookId,clientId);
    }
}
