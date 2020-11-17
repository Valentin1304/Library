import java.util.Map;

public class ClientService {
    private ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public Client getById(long id) {
        Client result = clientDao.getById(id);
        if (result == null) {
            throw new IllegalArgumentException("Cannot find book with this ID" + id);
        }
        return result;
    }

    public Map<Long, Client> deleteById(long idd) {

        return clientDao.deleteById(idd);
    }

    public Map<Long, Client> showClient() {
        return clientDao.showClient();
    }

    public Map<Long, Client> addClient(String firstName, String secondName, int age) {
        return clientDao.addClient(firstName, secondName, age);
    }
}
