package edu.pedro.aula_12_array;
import java.util.Arrays;

public class Array {
    public static int buscaBinaria(int[] vect, int elemento){
        int inicio = 0;
        int fim = vect.length - 1;

        while(inicio <= fim){
            int meio = inicio + (fim - inicio)/2;
            if(vect[meio] == elemento) {
                return meio;
            }
            if(vect[meio] < elemento) {
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] vect = {2,3,4,10,40};
        int elemento = 10;

        Arrays.sort(vect);

        int resultado = buscaBinaria(vect, elemento);
        if(resultado == -1){
            System.out.println("Elemento não encontrado :(");
        }
        else{
            System.out.printf("Posição: %d\nValor: %d", resultado,vect[resultado]);
        }
    }
}
