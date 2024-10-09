package Java100dias;
import java.util.ArrayList;
import java.util.Scanner;

public class Dia4Parte9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int soma = 0;
        int contador = 0;
        do {
            System.out.println("Insira a nota do aluno ou um numero negativo para sair: ");
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10){
                soma += nota;
                contador++;

            }
        }while(nota>=0);
        int media = soma / contador;
        System.out.println(media);
    }
}
