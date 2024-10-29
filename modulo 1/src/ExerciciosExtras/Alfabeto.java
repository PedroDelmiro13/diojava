package ExerciciosExtras;

import java.util.Scanner;

public class Alfabeto {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        char[] alfabeto = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'
        };
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        for(int i = 0; i <= numero; i++){
            System.out.println(alfabeto[i]);
        }
        System.out.printf("O número %d equivale a letra: %s", numero, alfabeto[numero]);
        sc.close();
    }
}
