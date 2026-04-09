package br.com.fiap.loja.model;
import br.com.fiap.loja.model.Fornecedor;
public class Produto {

    //public - modificador de acesso, deixando disponivel para todos
    public double preco;
    public int codigo;
    public String nome;
    public boolean disponivel;
    public Fornecedor fornecedor;

    }
    public double calcularDesconto(double porcentagem){
    preco += preco * porcentagem /180;
}

public double calcularValorTotal(int quantidade){
    return preco * quantidade;
}