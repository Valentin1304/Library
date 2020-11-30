import java.util.Map;

public interface ClientServiceInterface {
    public Client getById(long id);

    public void delete(long id);

    public Map<Long, Client> getClients();

    public Client addClient(String firstName, String secondName, int age);

    public Client updateClient(Client client);
}
