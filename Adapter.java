import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Adapter {
    private ApplictionContext applictionContext;

    public Adapter(ApplictionContext applictionContext) {
        this.applictionContext = applictionContext;
    }

    public void start() throws IOException {
        System.out.println("Добро пожаловать в электронную библиотеку\n" + "чтобы перейти в раздел книги, нажмите 1\n"
                + "чтобы перейти в раздел читатели, нажмите 2\n" + "чтобы перейти в раздел заказы, нажмите 3");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String reader = bufferedReader.readLine();
        int choice = Integer.parseInt(reader);
        switch (choice) {
            case 1:

                System.out.println("чтобы выбрать книгу по ID, нажмите 1\n"
                        + "удалить книгу по ID, нажмите 2\n" + "для добавления книги, нажмите 3\n" +
                        "для обновления книги по ID, нажмите 4");

                BufferedReader book = new BufferedReader(new InputStreamReader(System.in));
                String readerBook = book.readLine();
                int choice1 = Integer.parseInt(readerBook);
                switch (choice1) {
                    case 1:
                        System.out.println("Введите ID");
                        String getId = bufferedReader.readLine();
                        int id = Integer.parseInt(getId);
                        BookController bookController = (BookController) applictionContext.getObjectBook(BookController.class);
                        System.out.println(bookController.getById(id));
                        break;
                    case 2:
                        BookController bookController1 = (BookController) applictionContext.getObjectBook(BookController.class);
                        System.out.println(bookController1.getAllBooks());
                        System.out.println("Введите ID книги, которую вы хотите удалить");
                        String delete = bufferedReader.readLine();
                        int idForDelete = Integer.parseInt(delete);
                        bookController1.delete(idForDelete);
                        System.out.println(bookController1.getAllBooks());

                    case 3:

                        System.out.println("Введите название книги");
                        String bookName = bufferedReader.readLine();
                        System.out.println("Введите автора книги");
                        String authorName = bufferedReader.readLine();
                        BookController bookController2 = (BookController) applictionContext.getObjectBook(BookController.class);
                        System.out.println(bookController2.addBook(bookName, authorName));
                        break;
                    case 4:
                        System.out.println("Введите ID книги, которую вы хотите обновить");
                        String upDateBook = bufferedReader.readLine();
                        int idForUpdate = Integer.parseInt(upDateBook);
                        System.out.println("Введите название книги");
                        String bookNameForUpdate = bufferedReader.readLine();
                        System.out.println("Введите автора книги");
                        String authorNameForUpdate = bufferedReader.readLine();
                        BookController bookController3 = (BookController) applictionContext.getObjectBook(BookController.class);
                        System.out.println(bookController3.updateBook(idForUpdate, bookNameForUpdate, authorNameForUpdate));
                        break;
                }
                System.out.println("Если хотите продолжить, нажмите 1, для выхода нажмите 0");
                String restart = bufferedReader.readLine();
                int rest = Integer.parseInt(restart);
                if (rest ==1){
                    start();
                }
                break;


            case 2:
                System.out.println("чтобы выбрать читателя по ID, нажмите 1\n"
                        + "удалить читателя по ID, нажмите 2\n" + "для добавления читателя, нажмите 3\n" +
                        "для обновления данных о клиенте по ID, нажмите 4");

                BufferedReader client = new BufferedReader(new InputStreamReader(System.in));
                String readerClient = client.readLine();
                int choice2 = Integer.parseInt(readerClient);
                switch (choice2) {
                    case 1:
                        System.out.println("Введите ID");
                        String readerForId = bufferedReader.readLine();
                        int id = Integer.parseInt(readerForId);
                        ClientController clientController = (ClientController) applictionContext.getObjectClient(ClientController.class);
                        System.out.println(clientController.getById(id));
                        break;
                    case 2:
                        ClientController clientController1 = (ClientController) applictionContext.getObjectClient(ClientController.class);
                        System.out.println(clientController1.getClients());
                        System.out.println("Введите ID читателя, которого вы хотите удалить");
                        String delete = bufferedReader.readLine();
                        int idForDelete = Integer.parseInt(delete);
                        clientController1.delete(idForDelete);
                        System.out.println(clientController1.getClients());
                        break;
                    case 3:

                        System.out.println("Введите имя нового читателя");
                        String firstName = bufferedReader.readLine();
                        System.out.println("Введите фамилию нового читателя");
                        String secondName = bufferedReader.readLine();
                        System.out.println("Введите возраст нового читателя");
                        String ages = bufferedReader.readLine();
                        int age = Integer.parseInt(ages);
                        ClientController clientController2 = (ClientController) applictionContext.getObjectClient(ClientController.class);
                        System.out.println(clientController2.addClient(firstName, secondName, age));
                        break;
                    case 4:
                        System.out.println("Введите ID клиента, чьи данные вы хотите обновить");
                        String updateClient = bufferedReader.readLine();
                        int idForUpdate = Integer.parseInt(updateClient);
                        System.out.println("Введите обновленное имя читателя");
                        String firstNameForUpdate = bufferedReader.readLine();
                        System.out.println("Введите обновленную фамилию  читателя");
                        String secondNameForUpdate = bufferedReader.readLine();
                        System.out.println("Введите обновленный возраст читателя");
                        String ages1 = bufferedReader.readLine();
                        int ageForUpdate = Integer.parseInt(ages1);
                        ClientController clientController3 = (ClientController) applictionContext.getObjectClient(ClientController.class);
                        System.out.println(clientController3.updateClient(idForUpdate, firstNameForUpdate, secondNameForUpdate, ageForUpdate));
                        break;
                }
                System.out.println("Если хотите продолжить, нажмите 1, для выхода нажмите 0");
                String restart1 = bufferedReader.readLine();
                int rest1 = Integer.parseInt(restart1);
                if (rest1 ==1){
                    start();
                }
                break;

            case 3:
                System.out.println("чтобы создать заказ, нажмите 1\n"+"чтобы выбрать заказ по ID, нажмите 2\n"+ "чтобы удалить заказ, нажмите 3\n"+
                        "для обновления данных о заказе по ID, нажмите 4");
                BufferedReader order = new BufferedReader(new InputStreamReader(System.in));
                String readerOrder = order.readLine();
                int choice3 = Integer.parseInt(readerOrder);
                switch (choice3) {
                    case 1:
                        System.out.println("Введите ID книги");
                        String bookId = bufferedReader.readLine();
                        int bookID = Integer.parseInt(bookId);
                        System.out.println("Введите ID клиента");
                        String clientId = bufferedReader.readLine();
                        int clientID = Integer.parseInt(clientId);
                        OrderController orderController = (OrderController) applictionContext.getObjectOrder(OrderController.class);
                        System.out.println(orderController.addOrder(bookID, clientID));
                        break;
                    case 2:
                        System.out.println("Введите ID");
                        String readerForId = bufferedReader.readLine();
                        int id = Integer.parseInt(readerForId);
                        OrderController orderController1 = (OrderController) applictionContext.getObjectOrder(OrderController.class);
                        System.out.println(orderController1.getById(id));
                        break;
                    case 3:
                        OrderController orderController2 = (OrderController) applictionContext.getObjectOrder(OrderController.class);
                        System.out.println(orderController2.getOrders());
                        System.out.println("Введите ID заказа, которого вы хотите удалить");
                        String delete = bufferedReader.readLine();
                        int idForDelete = Integer.parseInt(delete);
                        orderController2.delete(idForDelete);
                        System.out.println(orderController2.getOrders());
                        break;
                    case 4:
                        System.out.println("Введите ID заказа, чьи данные вы хотите обновить");
                        String updateOrder = bufferedReader.readLine();
                        int idForUpdate = Integer.parseInt(updateOrder);
                        System.out.println("Введите обновленное Id книги");
                        String bookIdForUpdate = bufferedReader.readLine();
                        int bookIDForUpdate  = Integer.parseInt(bookIdForUpdate);
                        System.out.println("Введите обновленное Id читателя");
                        String clientIdForUpdate = bufferedReader.readLine();
                        int clientIDForUpdate = Integer.parseInt(clientIdForUpdate);
                        OrderController orderController3 = (OrderController) applictionContext.getObjectOrder(OrderController.class);
                        System.out.println(orderController3.updateOrder( idForUpdate,  bookIDForUpdate,  clientIDForUpdate));
                        break;
                }
                System.out.println("Если хотите продолжить, нажмите 1, для выхода нажмите 0");
                String restart2 = bufferedReader.readLine();
                int rest2 = Integer.parseInt(restart2);
                if (rest2 ==1){
                    start();
                }
                break;
        }
    }
}
