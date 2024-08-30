package edu.pedro.atividades;

public class Escola {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double VerificarNota(double nota1, double nota2, double nota3) {
        double total = nota1 + nota2 + nota3;

        if (total >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.printf("Reprovado, faltam %.2f pontos \n", 60 - total);
        }
        return total;
    }
}


