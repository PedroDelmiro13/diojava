package ExerciciosExtras;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Verificando se o número é primo: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Não é primo");
        }else if (n == 2) {
            System.out.println("Primo");
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Não é primo");
                return;
            }
        }
        System.out.println("É primo");
        sc.close();
    }
}
