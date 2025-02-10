package edu.pedro.desafio;
import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int maxTentativa = 3;
        int tentativa = 0;
        int RandomInt = random.nextInt(11);

        while (tentativa < maxTentativa) {
            System.out.println("Jogo do número secreto, insira o chute: ");
            int RandomChute = sc.nextInt();
            tentativa++;

            String resultado = GuessTheNumber.verificarPalpite(RandomChute, RandomInt);
            System.out.println(resultado);

            if (RandomChute == RandomInt) {
                break;
            }

        }
    }
}

