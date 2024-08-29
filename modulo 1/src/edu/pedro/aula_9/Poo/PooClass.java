package edu.pedro.aula_9.Poo;
import java.util.Scanner;


public class PooClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com os valores do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os valores do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area de X: " + areaX);
        System.out.println("Area de Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("A maior área é a de X");

        }else
            System.out.println("a maior área é a de y");
        sc.close();
    }
}
