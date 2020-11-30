import java.util.Map;

public class ClientController {
    private ClientServiceInterface clientServiceInterface;

    public ClientController(ClientServiceInterface clientServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
    }

    public Client getById(long id) {
        return clientServiceInterface.getById(id);
    }

    public void delete(long id) {
        clientServiceInterface.delete(id);
    }

    public Map<Long, Client> getClients() {
        return clientServiceInterface.getClients();
    }


    public Client addClient(String firstName, String secondName, int age) {
        return clientServiceInterface.addClient(firstName, secondName, age);
    }

    public Client updateClient(long id, String firstName, String secondName, int age) {
        Client client = new Client(id, firstName, secondName, age);
        return clientServiceInterface.updateClient(client);
    }
}
