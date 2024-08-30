package edu.pedro.atividades;

import java.util.Scanner;

public class LeitorDeDados {
    public static void main(String[] args) {
        Salario salario = new Salario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu nome: ");
        salario.nome = sc.nextLine();

        System.out.println("Insira o seu salário: ");
        salario.salario = sc.nextDouble();

        System.out.println("Insira a taxa de imposto: ");
        salario.taxa = sc.nextDouble();

        System.out.printf("Dados do usuário: %s, %.0f\n", salario.nome, salario.calculaTaxa(salario.salario, salario.taxa));

        System.out.println("Insira o valor da taxa de aumento: ");
        salario.incremento= sc.nextDouble();

        System.out.printf("Dados atualizados: %s, %.0f\n", salario.nome, salario.SalarioIncrementado(salario.salario, salario.incremento));

    }
}
