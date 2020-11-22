import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderService {

    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    public Map<Long, Order> addOrder(long bookID, long clientID) {


        return orderDao.addOrder(bookID, clientID);
    }
}
