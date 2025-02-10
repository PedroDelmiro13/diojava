package edu.pedro.desafio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class blabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> opcao = new ArrayList<>();
        int escolha = 0;
        while (escolha != 6) {
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1- Adicionar itens ao array");
            System.out.println("2- Deletar itens do array");
            System.out.println("3- Exibir os itens em uma lista numerada");
            System.out.println("4- Exibir os itens em ordem alfabética");
            System.out.println("5- Buscar se um item está ou não na lista");
            System.out.println("6- Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("O que deseja adicionar?");
                    sc.nextLine();
                    String adicionar = sc.nextLine();
                    opcao.add(adicionar);
                    break;
                case 2:
                    System.out.println("O que deseja remover?");
                    sc.nextLine();
                    String remover = sc.nextLine();
                    if (opcao.contains(remover)) {
                        opcao.remove(remover);
                        System.out.println("Item removido");
                    } else {
                        System.out.println("Item não encontrado");
                    }
                    break;
                case 3:
                    for (int i = 0; i < opcao.size(); i++) {
                        System.out.printf("%d - %s\n", i + 1, opcao.get(i));
                    }
                    break;
                case 4:
                    Collections.sort(opcao);
                    System.out.println(opcao);
                    break;
                case 5:
                    System.out.println("O que deseja buscar?");
                    sc.nextLine();
                    String buscar = sc.nextLine();
                    if (opcao.contains(buscar)) {
                        System.out.println("O item está na lista!");
                    } else {
                        System.out.println("O item não está na lista");
                    }
                    break;
                case 6:
                    break;
            }
        }
    }
}
