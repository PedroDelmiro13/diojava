package ExerciciosExtras;

import java.util.Scanner;

public class TesteDeConhecimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de inicio: ");
        int inicio = sc.nextInt();
        System.out.println("Digite o numero de fim: ");
        int fim = sc.nextInt();

        for(int i = inicio; i < fim; i++){
            if(i <= 1){
                continue;
            }
            boolean Primo = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    Primo = false;
                    break;
                }
            }
            if(Primo){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
