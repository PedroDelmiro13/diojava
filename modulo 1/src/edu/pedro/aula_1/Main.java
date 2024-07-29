package edu.pedro.aula_1;

public class Main {
    public static void main(String[] args) {
        String primeiroNome = "Gleydson";
        String segundoNome = "Michael";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
