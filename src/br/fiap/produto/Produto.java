package br.fiap.produto;

import java.text.DecimalFormat;

public class Produto {
    public int id;
    public String nome;
    public double valorUnitario;
    public int quantidadeEmEstoque;

    public Produto(int id, String nome, double valorUnitario, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto(int id) {
        this.id = id;
    }

    public void adicionaEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void debitarEstoque(int quantidade) {
        this.quantidadeEmEstoque -= quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "Nome: " + nome + "\n";
        aux += "Valor: R$ " + df.format(valorUnitario) + "\n";
        aux += "Quantidade: " + quantidadeEmEstoque + "\n";
        return aux;
    }
}

