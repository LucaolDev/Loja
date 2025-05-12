package br.fiap.notaFiscal;

import br.fiap.cliente.Cliente;
import br.fiap.item.ItemProduto;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<ItemProduto> listaProduto;
    private Cliente cliente;
    private boolean status;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
        this.listaProduto = new ArrayList<ItemProduto>();
    }

    public void adicionarItemProduto(ItemProduto itemProduto) {
        this.listaProduto.add(itemProduto);
    }

    public void removerItemProduto(ItemProduto itemProduto) {
        this.listaProduto.remove(itemProduto);
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