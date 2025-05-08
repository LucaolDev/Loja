import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "arroz", 50));
        lista.add(new Produto(1, "arroz", 50));
        lista.add(new Produto(1, "arroz", 50));
        lista.add(new Produto(1, "arroz", 50));
        lista.add(new Produto(2, "feijao", 45));
        lista.add(new Produto(3, "picanha", 90));

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase("arroz")){
                lista.remove(i);
            i--;
            }
        }

        lista.remove(new Produto(1, "arroz", 50));

        for (Produto p : lista){

        }

        System.out.println(lista);
    }
}
