import java.util.HashMap;
import java.util.Map;


public class ClientCatalog {
    private Map<Long, Client> client = new HashMap<>() {{
        this.put(1L, new Client(1L, "Nick", "Jamies", 25));
        this.put(1L, new Client(2L, "Jack", "Ivanov", 18));
        this.put(1L, new Client(3L, "Mike", "Tayson", 45));
        this.put(1L, new Client(4L, "Alex", "Klinton", 35));
        this.put(1L, new Client(5L, "Fedor", "Byden", 60));
    }};

    public Map<Long, Client> getClient() {
        return client;
    }

    public void setClient(Map<Long, Client> client) {
        this.client = client;
    }
}
