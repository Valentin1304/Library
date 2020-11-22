import java.util.HashMap;
import java.util.Map;

public class OrderCatalog {
    private Map<Long, Order> order = new HashMap<>();

    public Map getOrder() {
        return order;
    }
}
