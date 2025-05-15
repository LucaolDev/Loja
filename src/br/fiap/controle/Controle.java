package br.fiap.controle;

import br.fiap.cliente.Cliente;
import br.fiap.item.ItemProduto;
import br.fiap.notaFiscal.NotaFiscal;
import br.fiap.produto.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Long.parseLong;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Controle {

    private static List<Cliente> listaCliente = new ArrayList<>();
    private static List<Produto> listaProduto = new ArrayList<>();
    private NotaFiscal nf;

    static {
        // dados do cliente
        listaCliente.add(new Cliente(123, "Ana Maria"));
        listaCliente.add(new Cliente(456, "Robert Carlos"));
        listaCliente.add(new Cliente(789, "Xuxa Maira"));

        // dados dos produtos
        listaProduto.add(new Produto(1, "camiseta", 390, 100));
        listaProduto.add(new Produto(2, "calça", 1500, 1000));
        listaProduto.add(new Produto(3, "boné", 200, 200));

    }

    public Controle() {
        Random rd = new Random();
        Cliente cliente = listaCliente.get(rd.nextInt(listaCliente.size()));
        nf = new NotaFiscal(cliente);
    }

    public void menu() {
        int opcao;
        while (true) {
            try {
                opcao = parseInt(showInputDialog(gerarMenu()));
                if (opcao == 4) {
                    return;
                }
                switch (opcao) {
                    case 1:
                        comprar();
                        break;
                    case 2:
                        removerProduto();
                        break;
                    case 3:
                        fecharCompra();
                        break;
                }

            } catch (Exception e) {
                showMessageDialog(null, e.getMessage());
            }

        }
    }

    private void removerProduto() {
        String nome = showInputDialog("Qual produto sera removido");
        Produto produto = new Produto(nome);
        nf.removerProduto(produto);
    }

    private void fecharCompra(){
        double total = 0;
        for (ItemProduto item : nf.getListaProduto()){
            total += item.calcularTotal();
        }
        showMessageDialog(null, "R$ " + total);
    }

    private void comprar() {
        int quantidade;
        String nomeProduto = showInputDialog("Qual produto você quer comprar ?");

        for (Produto p : listaProduto) {
            if (p.getNome().equalsIgnoreCase(nomeProduto)) {
                quantidade = parseInt(showInputDialog("Qual a quantidade que será comprada? "));
                p.debitarEstoque(quantidade);
                nf.adicionarProduto(new ItemProduto(p, quantidade));
            }

        }

    }

    private String gerarMenu() {
        String aux = "SISTEMA DE COMPRAS ONLINE\n";
        aux += "1. Comprar\n";
        aux += "2. Remover produto\n";
        aux += "3. Fechar compra\n";
        aux += "4. Finalizar compra\n";
        return aux;
    }



}