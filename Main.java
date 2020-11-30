import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplictionContext applictionContext = new ApplictionContext();
        applictionContext.intializeCotextBook();
        applictionContext.intializeCotextClient();
        applictionContext.intializeCotextOrder();
        Adapter adapter = new Adapter(applictionContext);
        adapter.start();

    }
}
