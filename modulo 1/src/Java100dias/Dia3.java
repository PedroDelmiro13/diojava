package Java100dias;

import java.util.Scanner;

public class Dia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorUsuario = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= valorUsuario; i++) {
            fatorial *= i;
            System.out.println(fatorial);
        }
    }
}
