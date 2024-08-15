package edu.pedro.desafio;

public class GuessTheNumber {

    public static String verificarPalpite(int RandomChute, int RandomInt) {
        if (RandomChute < RandomInt) {
            return "O número secreto é maior que " + RandomChute + " e é " + (RandomInt % 2 == 0 ? "par" : "ímpar") + ".";
        } else if (RandomChute > RandomInt) {
            return "O número secreto é menor que " + RandomChute + " e é " + (RandomInt % 2 == 0 ? "par" : "ímpar") + ".";
        } else {
            return "Parabéns! Você adivinhou o número ";
        }
    }

}
