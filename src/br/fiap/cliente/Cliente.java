package br.fiap.cliente;

public class Cliente {
    public int cpf;
    public String nome;

    public Cliente(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "CPF: " + cpf + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;
    }
}

