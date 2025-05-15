package br.fiap.notaFiscal;

import br.fiap.cliente.Cliente;
import br.fiap.item.ItemProduto;
import br.fiap.produto.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NotaFiscal {
    private List<ItemProduto> listaProduto;
    private Cliente cliente;
    private boolean status;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
        this.listaProduto = new ArrayList<ItemProduto>();
        this.status = true;
    }

    public void adicionarProduto(ItemProduto itemProduto) {
        this.listaProduto.add(itemProduto);
    }

    public void removerProduto(Produto produto) {
        for (ItemProduto item : listaProduto){
            if(item.getProduto().equals(produto)){
                listaProduto.remove(item);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemProduto itemProduto : this.listaProduto) {
            total += itemProduto.calcularTotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemProduto> getListaProduto() {
        return listaProduto;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}