import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class ClientDao {
    private ClientCatalog clientCatalog;

    public ClientDao(ClientCatalog clientCatalog) {
        this.clientCatalog = clientCatalog;
    }

    public Client getById(long id) {
        Client client = clientCatalog.getClient().get(id);
        return client;

    }


    public Map<Long, Client> deleteById(long idd) {
        clientCatalog.getClient().remove(idd);
        Map<Long, Client> client = clientCatalog.getClient();
        return client;

    }

    public Map<Long, Client> showClient() {
        Map<Long, Client> client = clientCatalog.getClient();
        return client;
    }

    public Long createId() {
        Set<Long> longs = clientCatalog.getClient().keySet();
        Long max = Collections.max(longs);
        return max + 1;
    }

    public Map<Long, Client> addClient(String firstName, String secondName, int age) {
        Map<Long, Client> clients = clientCatalog.getClient();
        clients.put(createId(), new Client(createId(), firstName, secondName, age));
        return clientCatalog.getClient();
    }
}
