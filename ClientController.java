import java.util.Map;

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public Client clientIdFromAdapter(long id) {
        return clientService.getById(id);

    }

    public Map<Long, Client> clientIdForDelete(long idd) {
        return clientService.deleteById(idd);
    }

    public Map<Long, Client> showClient() {
        return clientService.showClient();
    }


    public Map<Long, Client> addClient(String firstName, String secondName, int age) {
        return clientService.addClient(firstName, secondName, age);
    }
}
