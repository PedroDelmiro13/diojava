package ExerciciosExtras;

import java.util.Scanner;

public class Dia4Parte5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o Limite");
        int limite;
        while (true) {
            limite = in.nextInt();
            if (limite != 0) {
                System.out.println("Continue, para fechar é só inserir 0");
            }else {
                System.out.println("Fim");
                break;
            }
        }
        in.close();
    }
}
