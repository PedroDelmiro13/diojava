package edu.pedro.desafiopoo;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preco*quantidade;
    }
    public void adicionarProduto(int quantidade){
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return nome+ ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $" + String.format("%.2f", valorTotalEmEstoque());
    }
}
