package edu.pedro.atividades;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Account account;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.next();
        System.out.println("Is there and initial deposit (y/n)?: ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account = new Account(holder, number, deposit);
        }
        else if (response == 'n') {
            account = new Account(holder, number);
        }
        System.out.println();
        System.out.println("Account data: ");
        //System.out.println(account.toString());

        sc.close();
    }
}
