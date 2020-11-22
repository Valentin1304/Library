import java.util.Map;

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public Map<Long, Order> addOrder(long bookID, long clientID) {
        return orderService.addOrder(bookID, clientID);
    }
}
