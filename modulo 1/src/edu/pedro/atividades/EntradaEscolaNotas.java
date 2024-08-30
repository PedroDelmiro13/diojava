package edu.pedro.atividades;

import java.util.Scanner;

public class EntradaEscolaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escola escola = new Escola();

        System.out.println("Digite o nome do aluno: ");
        escola.nome = sc.nextLine();

        System.out.println("Insira a nota do primeiro trimestre: ");
        escola.nota1 = sc.nextDouble();

        System.out.println("Insira a nota do segundo trimestre: ");
        escola.nota2 = sc.nextDouble();

        System.out.println("Insira a nota do terceiro trimestre: ");
        escola.nota3 = sc.nextDouble();

        System.out.println(escola.VerificarNota(escola.nota1, escola.nota2, escola.nota3));
    }
}
