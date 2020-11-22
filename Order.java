public class Order {
    private Long orderID;
    private Book book;
    private Client client;

    public Order(Long orderID, Book book, Client client) {
        this.orderID = orderID;
        this.book = book;
        this.client = client;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", book=" + book +
                ", client=" + client +
                '}';
    }
}
