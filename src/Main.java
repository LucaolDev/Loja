import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "arroz", 50));
        lista.add(new Produto(2, "feijao", 45));
        lista.add(new Produto(3, "picanha", 90));
    }
}
