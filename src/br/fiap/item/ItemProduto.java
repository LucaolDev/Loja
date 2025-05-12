package br.fiap.item;

import br.fiap.produto.Produto;

import java.text.DecimalFormat;

public class ItemProduto {
    public Produto produto;
    public int quantidadeComprada;

    public ItemProduto(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidadeComprada = quantidade;
    }

    public double calcularTotal() {
        return this.produto.getValorUnitario() * this.quantidadeComprada;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidade) {
        this.quantidadeComprada = quantidade;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "Produto: " + produto.getNome() + "\n";
        aux += "Valor unitári: R$ " + produto.getValorUnitario() + "\n";
        aux += "Quantidade compradada: " + quantidadeComprada + "\n";
        return aux;
    }
}
