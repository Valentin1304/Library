import java.util.HashMap;

public class ApplictionContext {
    private HashMap context = new HashMap();

    public ApplictionContext() {

    }

    public void intializeCotext() {
        BookCatalog bookCatalog = new BookCatalog();
        BookDao bookDao = new BookDao(bookCatalog);
        BookService bookService = new BookService(bookDao);
        BookController bookController = new BookController(bookService);
        context.put(BookController.class, bookController);


    }

    public Object getObject(Class clazz) {
        return context.get(clazz);
    }

    public void intializeCotextt() {
        ClientCatalog clientCatalog = new ClientCatalog();
        ClientDao clientDao = new ClientDao(clientCatalog);
        ClientService clientService = new ClientService(clientDao);
        ClientController clientController = new ClientController(clientService);
        context.put(ClientController.class, clientController);


    }

    public Object getObjectt(Class clazz) {
        return context.get(clazz);
    }

    public void intializeCotexttt() {
        OrderCatalog orderCatalog = new OrderCatalog();
        OrderDao orderDao = new OrderDao(orderCatalog);
        OrderService orderService = new OrderService(orderDao);
        OrderController orderController = new OrderController(orderService);
        context.put(OrderController.class, orderController);


    }

    public Object getObjecttt(Class clazz) {
        return context.get(clazz);
    }


}
