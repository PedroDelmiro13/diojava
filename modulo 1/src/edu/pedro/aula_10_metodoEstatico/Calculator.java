package edu.pedro.aula_10_metodoEstatico;

public class Calculator {
    public static final double PI = 3.14159265358979323846;

    public static double circunference(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
