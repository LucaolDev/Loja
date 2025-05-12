package br.fiap.item;

import br.fiap.produto.Produto;

import java.text.DecimalFormat;

public class ItemProduto {
    public Produto produto;
    public int quantidade;

    public ItemProduto(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return this.produto.getValorUnitario() * this.quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "Produto: " + produto.getNome() + "\n";
        aux += "Valor unitári: R$ " + produto.getValorUnitario() + "\n";
        aux += "Quantidade compradada: " + quantidade + "\n";
        return aux;
    }
}
