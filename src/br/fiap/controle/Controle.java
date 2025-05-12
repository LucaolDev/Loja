package br.fiap.controle;

import br.fiap.cliente.Cliente;
import br.fiap.notaFiscal.NotaFiscal;
import br.fiap.produto.Produto;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.parseLong;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Controle {

    private static List<Cliente> listaCliente = new ArrayList<>();
    private static List<Produto> listaProduto = new ArrayList<>();
    private NotaFiscal nf;

    static{
        // dados do cliente
        listaCliente.add(new Cliente(123, "Ana Maria"));
        listaCliente.add(new Cliente(456, "Robert Carlos"));
        listaCliente.add(new Cliente(789, "Xuxa Maira"));

        // dados dos produtos
        listaProduto.add(new Produto(1, "camiseta", 390, 100));
        listaProduto.add(new Produto(2, "calça", 1500, 1000));
        listaProduto.add(new Produto(3, "boné", 200, 500));

    }

    public void menu() {
        int opcao;
        while(true) {
            try {
                opcao = parseInt(showInputDialog(gerarMenu()));
                if(opcao == 5){
                    return;
                }

            }
            catch (Exception e){
                showMessageDialog(null, e.getMessage());
            }

        }
    }

    private String gerarMenu() {
        String aux = "SISTEMA DE COMPRAS ONLINE";
        aux += "1. Comprar\n";
        aux += "2. Adicionar produto\n";
        aux += "3. Remover produto\n";
        aux += "4. Fechar compra\n";
        aux += "5. Finalizar compra\n";
        return aux;
    }

}