package edu.pedro.aula_3_operadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1+"1";

        System.out.println(concatenacao);

        //Operadores unários

        int numero = 5;

        int numero2 = -5;

        numero = -numero;
        numero2 = -numero2;
        System.out.println(numero);
        System.out.println(numero2);

        //repetição

        int numero3 = 5;
        System.out.println(++ numero3);
        System.out.println(numero3);

        //booleano
        boolean variavel = true;
        System.out.println(!variavel);

        //Operador ternário

        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "igual" : "diferente";

        System.out.println(resultado);

        //relacionais

        int n1 = 1;
        int n2 = 2;

        boolean simNao = n1 != n2;

        System.out.println("n1 é igual a n2?" + simNao);

        String nomeUm = "gledson";
        String nomeDois = "gledson";

        System.out.println(nomeUm.equals(nomeDois));

        // E ou OU

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
