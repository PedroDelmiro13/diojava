package edu.pedro.aula_9.Poo;
import java.util.Scanner;


public class ProblemasPoo {
    public static void main(String[] args) {

        //Resolvendo um problema de área de triangulo SEM usar POO

        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com os valores do triangulo x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com os valores do triangulo y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC);
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));

        System.out.println("Area de X: " + areaX);
        System.out.println("Area de Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("A maior área é a de X");

        }else
            System.out.println("a maior área é a de y");
        sc.close();
    }
}
