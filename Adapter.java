import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adapter {
    private ApplictionContext applictionContext;

    public Adapter(ApplictionContext applictionContext) {
        this.applictionContext = applictionContext;
    }

    public void start() throws IOException {
        System.out.println("Добро пожаловать в электронную библиотеку\n" + "чтобы перейти в раздел книги, нажмите 1\n"
                + "чтобы перейти в раздел читатели, нажмите 2\n"+"чтобы перейти в раздел заказы, нажмите 3");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String reader = bufferedReader.readLine();
        int choice = Integer.parseInt(reader);
        switch (choice) {
            case 1:

                System.out.println("чтобы выбрать книгу по ID, нажмите 1\n"
                        + "удалить книгу по ID, нажмите 2\n" + "для добавления книги, нажмите 3\n" +
                        "для обновления книги по ID, нажмите 4");

                BufferedReader bufferedReaderr = new BufferedReader(new InputStreamReader(System.in));
                String readerr = bufferedReaderr.readLine();
                int choice1 = Integer.parseInt(readerr);
                switch (choice1) {
                    case 1:
                        System.out.println("Введите ID");
                        String getId = bufferedReader.readLine();
                        int id = Integer.parseInt(getId);
                        BookController bookController = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookController.getById(id));
                        break;
                    case 2:
                        BookController bookController1 = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookController1.showBook());
                        System.out.println("Введите ID книги, которую вы хотите удалить");
                        String delete= bufferedReader.readLine();
                        int idd = Integer.parseInt(delete);
                        BookController bookController2 = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookController2.delete(idd));
                        break;
                    case 3:

                        System.out.println("Введите название книги");
                        String bookName = bufferedReader.readLine();
                        System.out.println("Введите автора книги");
                        String authorName = bufferedReader.readLine();
                        BookController bookController3 = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookController3.addBook(bookName, authorName));
                        break;
                    case 4:
                        System.out.println("Введите ID книги, которую вы хотите обновить");
                        String upDateBook = bufferedReader.readLine();
                        int iddd = Integer.parseInt(upDateBook);
                        System.out.println("Введите название книги");
                        String bookNamee = bufferedReader.readLine();
                        System.out.println("Введите автора книги");
                        String authorNamee = bufferedReader.readLine();
                        BookController bookController4 = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookController4.updateBook(iddd, bookNamee, authorNamee));
                        break;

                }
                break;

            case 2:
                System.out.println("чтобы выбрать читателя по ID, нажмите 1\n"
                        + "удалить читателя по ID, нажмите 2\n" + "для добавления читателя, нажмите 3\n"+
                        "для обновления данных о клиенте по ID, нажмите 4");

                BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
                String reader1 = bufferedReader1.readLine();
                int choice2 = Integer.parseInt(reader1);
                switch (choice2) {
                    case 1:
                        System.out.println("Введите ID");
                        String readerForId = bufferedReader.readLine();
                        int id = Integer.parseInt(readerForId);
                        ClientController clientController = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientController.getById(id));
                        break;
                    case 2:
                        ClientController clientController1 = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientController1.showClient());
                        System.out.println("Введите ID читателя, которого вы хотите удалить");
                        String delete = bufferedReader.readLine();
                        int id1 = Integer.parseInt(delete);
                        ClientController clientController2 = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientController2.delete(id1));
                        break;
                    case 3:

                        System.out.println("Введите имя нового читателя");
                        String firstName = bufferedReader.readLine();
                        System.out.println("Введите фамилию нового читателя");
                        String secondName = bufferedReader.readLine();
                        System.out.println("Введите возраст нового читателя");
                        String ages = bufferedReader.readLine();
                        int age = Integer.parseInt(ages);
                        ClientController clientController3 = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientController3.addClient(firstName, secondName, age));
                        break;
                    case 4:
                        System.out.println("Введите ID клиента, чьи данные вы хотите обновить");
                        String updateClient = bufferedReader.readLine();
                        int id2 = Integer.parseInt(updateClient);
                        System.out.println("Введите обновленное имя читателя");
                        String firstName1 = bufferedReader.readLine();
                        System.out.println("Введите обновленную фамилию  читателя");
                        String secondName1 = bufferedReader.readLine();
                        System.out.println("Введите обновленный возраст читателя");
                        String ages1 = bufferedReader.readLine();
                        int age1 = Integer.parseInt(ages1);
                        ClientController clientController4 = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientController4.updateClient(id2, firstName1, secondName1,age1));
                        break;
                }
            case 3:
                System.out.println("чтобы создать заказ, нажмите 1");
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
                String reader2 = bufferedReader2.readLine();
                int choice3 = Integer.parseInt(reader2);
                switch (choice3) {
                    case 1:
                        System.out.println("Введите ID книги");
                        String bookId = bufferedReader.readLine();
                        int bookID = Integer.parseInt(bookId);
                        System.out.println("Введите ID клиента");
                        String clientId = bufferedReader.readLine();
                        int clientID = Integer.parseInt(clientId);
                        OrderController orderController = (OrderController) applictionContext.getObjecttt(OrderController.class);
                        System.out.println(orderController.addOrder(bookID,clientID));
                        break;
                }
                break;
        }
    }
}
