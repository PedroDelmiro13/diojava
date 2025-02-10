package edu.pedro.desafiopoo;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite os dados do produto: ");

        System.out.print("Nome: ");
        produto.nome = sc.next();

        System.out.println("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.println("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println("Dados do produto " + produto);

        System.out.println("Entre com o número de produtos para serem adicionados no estoque");
        int quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println("Dados atualizados: " + produto);

        System.out.println("Entre com o número de produtos para serem removidos no estoque");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
