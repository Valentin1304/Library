import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class ClientDao implements ClientDaoInterface {
    private ClientCatalog clientCatalog;

    public ClientDao(ClientCatalog clientCatalog) {
        this.clientCatalog = clientCatalog;
    }

    public Client getById(long id) {
        Client client = clientCatalog.getClient().get(id);
        return client;

    }


    public void delete(long id) {
        clientCatalog.getClient().remove(id);
    }

    public Map<Long, Client> getClients() {
        Map<Long, Client> client = clientCatalog.getClient();
        return client;
    }

    public Long createId() {
        Set<Long> ides = clientCatalog.getClient().keySet();
        Long max = Collections.max(ides);
        return max + 1;
    }

    public Client addClient(String firstName, String secondName, int age) {
        Map<Long, Client> clients = clientCatalog.getClient();
        clients.put(createId(), new Client(createId(), firstName, secondName, age));
        return clients.get(createId() - 1);
    }

    public Client updateClient(Client client) {
        Long id = client.getId();
        clientCatalog.getClient().put(id, client);
        return clientCatalog.getClient().put(id, client);

    }
}
