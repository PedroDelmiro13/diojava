package ExerciciosExtras;
import java.util.Random;
import java.util.Scanner;

public class Dia4Parte2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(11);
        int tentativa = 0;

        System.out.println("Adivinhe o número secreto entre 1 e 10:");
        while (true) {
            tentativa = scanner.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você adivinhou o número secreto: " + numeroSecreto);
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior . Tente novamente:");
            } else {
                System.out.println("O número secreto é menor. Tente novamente:");
            }
        }
        scanner.close();
    }
}

