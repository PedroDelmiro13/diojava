package edu.pedro.atividades;

public class Retangulo {
    public double width;
    public double height;

    public double area(double width, double height) {
        return width * height;
    }
    public double perimetro(double width, double height) {
        return width + height;
    }
    public double diagonal(double width, double height) {
        return Math.sqrt(width * width + height * height);
    }
}
