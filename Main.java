import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplictionContext applictionContext = new ApplictionContext();
        applictionContext.intializeCotext();
        applictionContext.intializeCotextt();
        Adapter adapter = new Adapter(applictionContext);
        adapter.start();

    }
}
