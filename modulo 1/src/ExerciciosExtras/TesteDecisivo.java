package ExerciciosExtras;

import java.util.Scanner;

public class TesteDecisivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Numero inteiro positivo: ");
        int N = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++) {
            int bla = 2 * i + 1;
            soma += bla;
            System.out.println(bla);
        }
        System.out.printf("Soma dos %d numeros impares: %d", N, soma);
        sc.close();
    }
}
