package ExerciciosExtras;

import java.util.Scanner;

public class Dia4Parte10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        int limite;
        do {
            System.out.println("Insira uma temperatura em Graus celsius para converter para Fahrenheint");
            celsius = sc.nextDouble();
            double fahrenheint = (celsius * 1.8) + 32;
            System.out.println(fahrenheint);
            System.out.println("Quer continuar? se sim, digite 1, se não clique em qualquer tecla: ");
            limite = sc.nextInt();

        } while (limite == 1);
        sc.close();
    }
}
