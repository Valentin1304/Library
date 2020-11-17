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
                + "чтобы перейти в раздел читатели, нажмите 2\n");
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
                int choicee = Integer.parseInt(readerr);
                switch (choicee) {
                    case 1:
                        System.out.println("Введите ID");
                        String readerForId = bufferedReader.readLine();
                        int id = Integer.parseInt(readerForId);
                        BookController bookController = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookController.getById(id));
                        break;
                    case 2:
                        BookController bookControllerrr = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookControllerrr.showBook());
                        System.out.println("Введите ID книги, которую вы хотите удалить");
                        String deleteForId = bufferedReader.readLine();
                        int idd = Integer.parseInt(deleteForId);
                        BookController bookControllerr = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookControllerr.delete(idd));
                        break;
                    case 3:

                        System.out.println("Введите название книги");
                        String bookName = bufferedReader.readLine();
                        System.out.println("Введите автора книги");
                        String authorName = bufferedReader.readLine();
                        BookController bookControllerrrr = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookControllerrrr.addBook(bookName, authorName));
                        break;
                    case 4:
                        System.out.println("Введите ID книги, которую вы хотите обновить");
                        String upDateBook = bufferedReader.readLine();
                        int iddd = Integer.parseInt(upDateBook);
                        System.out.println("Введите название книги");
                        String bookNamee = bufferedReader.readLine();
                        System.out.println("Введите автора книги");
                        String authorNamee = bufferedReader.readLine();
                        BookController bookControllerrrrr = (BookController) applictionContext.getObject(BookController.class);
                        System.out.println(bookControllerrrrr.updateBook(iddd, bookNamee, authorNamee));
                        break;

                }
                break;

            case 2:
                System.out.println("чтобы выбрать читателя по ID, нажмите 1\n"
                        + "удалить читателя по ID, нажмите 2\n" + "для добавления читателя, нажмите 3");

                BufferedReader bufferedReaderrr = new BufferedReader(new InputStreamReader(System.in));
                String readerrr = bufferedReaderrr.readLine();
                int choiceee = Integer.parseInt(readerrr);
                switch (choiceee) {
                    case 1:
                        System.out.println("Введите ID");
                        String readerForId = bufferedReader.readLine();
                        int id = Integer.parseInt(readerForId);
                        ClientController clientController = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientController.clientIdFromAdapter(id));
                        break;
                    case 2:
                        ClientController clientControllerr = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientControllerr.showClient());
                        System.out.println("Введите ID читателя, которого вы хотите удалить");
                        String deleteForId = bufferedReader.readLine();
                        int idd = Integer.parseInt(deleteForId);
                        ClientController clientControllerrr = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientControllerrr.clientIdForDelete(idd));
                        break;
                    case 3:

                        System.out.println("Введите имя нового читателя");
                        String firstName = bufferedReader.readLine();
                        System.out.println("Введите фамилию нового читателя");
                        String secondName = bufferedReader.readLine();
                        System.out.println("Введите возраст нового читателя");
                        String ages = bufferedReader.readLine();
                        int age = Integer.parseInt(ages);
                        ClientController clientControllerrrr = (ClientController) applictionContext.getObjectt(ClientController.class);
                        System.out.println(clientControllerrrr.addClient(firstName, secondName, age));
                        break;
                }
                break;
        }
    }
}
