package edu.pedro.atividades;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo t = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do triangulo: ");
        t.width = sc.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        t.height = sc.nextDouble();

        System.out.printf("A área do retângulo é: %.2f \n", t.area(t.width,t.height));
        System.out.printf("O perímetro do retângulo é: %.2f \n", t.perimetro(t.width,t.height));
        System.out.printf("A diagonal do retângulo é: %.2f \n", t.diagonal(t.width,t.height));
    }
}
