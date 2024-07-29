package edu.pedro.aula_sabado;

public class Vetores {
    public static void main(String[] args) {
        String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int [] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("O mês %s tem %d dias\n", meses[i], dias[i]);
        }
    }
}
