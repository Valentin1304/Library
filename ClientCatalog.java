import java.util.HashMap;
import java.util.Map;


public class ClientCatalog {
    Client client1 = new Client(1L, "Nick", "Jamies", 25);
    Client client2 = new Client(2L, "Jack", "Ivanov", 18);
    Client client3 = new Client(3L, "Mike", "Tayson", 45);
    Client client4 = new Client(4L, "Alex", "Klinton", 35);
    Client client5 = new Client(5L, "Fedor", "Byden", 60);

    private Map<Long, Client> client = new HashMap<>() {{
        this.put(1L, client1);
        this.put(2L, client2);
        this.put(3L, client3);
        this.put(4L, client4);
        this.put(5L, client5);

    }};


    public Map<Long, Client> getClient() {
        return client;
    }


}