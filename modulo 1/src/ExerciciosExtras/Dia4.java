package ExerciciosExtras;

public class Dia4 {
    public static void main(String[] args) {
        double[] notas = {
                7.5, 8.0, 9.2, 6.8, 7.0, 10.0, 5.5, 8.5, 7.7, 6.3,
                9.0, 6.0, 7.8, 8.2, 7.3, 9.5, 6.7, 5.8, 7.9, 8.4,
                9.1, 7.6, 6.9, 8.7, 7.4, 6.2, 7.2, 8.9, 7.1, 9.8
        };
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
            System.out.println(notas[i]);
        }
        double media = soma / notas.length;
        System.out.println(media);
    }
}
