import java.util.Map;

public interface ClientServiceInterface {
    public Client getById(long id);
    public String delete(long id);
    public Map<Long, Client> showClient();
    public Client addClient(String firstName, String secondName, int age);
    public Client updateClient (Client client);
}
