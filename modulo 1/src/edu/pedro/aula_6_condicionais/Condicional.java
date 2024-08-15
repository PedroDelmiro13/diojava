package edu.pedro.aula_6_condicionais;

public class Condicional {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (saldo >= valorSolicitado) {
            System.out.printf("O saldo %f é maior que que foi solicitado\n", saldo);
        }
        else if (saldo < valorSolicitado) {
            System.out.printf("O saldo %f é menor que que foi solicitado\n", saldo);
        }
        else{
                System.out.println("Não da pra sacar\n");
        }
        int dois = 3;
        String resultado = dois >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        int nota = 6;
        String resultado2 = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "recuperação" : "Reprovado";
        System.out.println(resultado2);

        //Switch case


    }
}
