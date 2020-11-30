import java.util.Map;

public class OrderController {
   private OrderServiceInterface orderServiceInterface;

    public OrderController(OrderServiceInterface orderServiceInterface) {
        this.orderServiceInterface = orderServiceInterface;
    }

    public Order addOrder(long bookID, long clientID) {
        return orderServiceInterface.addOrder(bookID, clientID);
    }
    public Order getById(long id){
        return orderServiceInterface.getById(id);
    }
    public void delete(long id){
        orderServiceInterface.delete(id);
    }
    public Map<Long,Order> getOrders(){
        return orderServiceInterface.getOrders();
    }
    public Order updateOrder(long orderId, long bookId, long clientId){
        return orderServiceInterface.updateOrder(orderId,bookId,clientId);
    }

}
