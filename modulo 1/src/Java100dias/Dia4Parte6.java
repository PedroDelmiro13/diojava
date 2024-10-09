package Java100dias;

import java.util.Scanner;

public class Dia4Parte6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = { 5,10,15,20,25,30,35,40,45,50};
        for (int itens : numeros){
            if (itens % 3 == 0){
                System.out.println(itens);
            };
        }
    }
}
