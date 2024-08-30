package edu.pedro.atividades;

public class Salario {
    public String nome;
    public double salario;
    public double taxa;
    public double incremento;


    public double calculaTaxa(double salario, double taxa) {
        return salario - taxa;
    }
    public double SalarioIncrementado(double salario, double incremento) {
        return salario * incremento + calculaTaxa(salario, taxa);
    }
}