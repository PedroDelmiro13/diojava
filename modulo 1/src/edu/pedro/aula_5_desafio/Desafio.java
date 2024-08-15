package edu.pedro.aula_5_desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //to do: conhecer e importar o scanner

        //exibir as mensagens para o usuario

        //obter pelo scanner os valores digitados no terminal

        //exibir a mensagem conta bancaria criada

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int num = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu saldo bancário: ");
        double saldo = sc.nextDouble();

        System.out.println("Conta criada com sucesso!");

        sc.close();
    }
}
