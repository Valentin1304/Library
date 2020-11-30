import java.util.Map;

public class ClientService implements ClientServiceInterface {
    private ClientDaoInterface clientDaoInterface;

    public ClientService(ClientDaoInterface clientDaoInterface) {
        this.clientDaoInterface = clientDaoInterface;
    }

    public Client getById(long id) {
        Client result = clientDaoInterface.getById(id);
        if (result == null) {
            throw new IllegalArgumentException("Cannot find book with this ID" + id);
        }
        return result;
    }

    public void delete(long id) {
        clientDaoInterface.delete(id);
    }

    public Map<Long, Client> getClients() {
        return clientDaoInterface.getClients();
    }

    public Client addClient(String firstName, String secondName, int age) {
        return clientDaoInterface.addClient(firstName, secondName, age);
    }

    public Client updateClient(Client client) {
        return clientDaoInterface.updateClient(client);
    }
}
