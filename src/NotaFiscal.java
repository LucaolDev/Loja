import java.util.ArrayList;

public class NotaFiscal {
    private Cliente cliente;
    private ArrayList<ItemProduto> lista;

    public double calcularValorNotaFiscal(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "NotaFiscal\n " +
                "cliente=" + cliente +
                ", lista=" + lista;
    }
}
