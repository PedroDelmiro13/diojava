package Java100dias;
import java.util.ArrayList;
import java.util.Scanner;

public class Dia4Parte8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        ArrayList<Integer> numeros = new ArrayList<>();
        do {
            System.out.print("Insira um número:");
            op = sc.nextInt();
            numeros.add(op);
        }while (op >= 0);
        System.out.println("Quantidade de numeros na lista: " + (numeros.size()-1));
        sc.close();
    }
}
