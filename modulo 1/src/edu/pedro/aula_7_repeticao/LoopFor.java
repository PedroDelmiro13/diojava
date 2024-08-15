package edu.pedro.aula_7_repeticao;

public class LoopFor {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 10; carneirinhos++) {
            System.out.printf("%d carneirinhos\n", carneirinhos);
        }
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.printf("%s ", alunos[x]);
        }
        for (int numero = 1; numero <= 10; numero++) {
            if (numero == 3)
                break;

            System.out.printf("%d ", numero);
        }

    }
}
