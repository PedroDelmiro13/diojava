package edu.pedro.atividaderapida;

public class Main {
    public static void main(String[] args) {
        Carros carros = new Carros();
        carros.setMarca("Ferrari");
        carros.setModelo("Ferrari");
        carros.setAnoFabricacao(1997);
        System.out.println("Marca: " + carros.getMarca());
        System.out.println("Modelo: " + carros.getModelo());
        System.out.println("AnoFabricacao: " + carros.getAnoFabricacao());
    }
}
