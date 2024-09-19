package edu.pedro.aula_10_metodoEstatico;
import java.util.Scanner;

public class estatico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o Raio");
        double raio = sc.nextDouble();

        double c = Calculator.circunference(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }

}
