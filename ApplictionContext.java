import java.util.HashMap;

public class ApplictionContext {
    private HashMap context = new HashMap();

    public ApplictionContext() {
    }

    public void intializeCotextBook() {
        BookCatalog bookCatalog = new BookCatalog();
        BookDao bookDao = new BookDao(bookCatalog);
        BookService bookService = new BookService(bookDao);
        BookController bookController = new BookController(bookService);
        context.put(BookController.class, bookController);
    }

    public Object getObjectBook(Class clazz) {
        return context.get(clazz);
    }

    public void intializeCotextClient() {
        ClientCatalog clientCatalog = new ClientCatalog();
        ClientDao clientDao = new ClientDao(clientCatalog);
        ClientService clientService = new ClientService(clientDao);
        ClientController clientController = new ClientController(clientService);
        context.put(ClientController.class, clientController);
    }

    public Object getObjectClient(Class clazz) {
        return context.get(clazz);
    }

    public void intializeCotextOrder() {

        BookCatalog bookCatalog = new BookCatalog();
        ClientCatalog clientCatalog = new ClientCatalog();
        OrderCatalog orderCatalog = new OrderCatalog();
        OrderDao orderDao = new OrderDao(orderCatalog, clientCatalog, bookCatalog);
        OrderService orderService = new OrderService(orderDao);
        OrderController orderController = new OrderController(orderService);
        context.put(OrderController.class, orderController);
    }

    public Object getObjectOrder(Class clazz) {
        return context.get(clazz);
    }
}
