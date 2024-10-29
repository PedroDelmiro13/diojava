package ExerciciosExtras;

import java.util.Scanner;

public class Dia4Parte7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = {"Alice","Bob","Carlos","Diana","Eduardo","Fernanda","Gustavo","Heloísa","Igor","Júlia"};
        int i = 1;
        for (String nome : nomes) {
            System.out.println(i + "-" + nome);
            i++;
        }
        sc.close();
    }
}
