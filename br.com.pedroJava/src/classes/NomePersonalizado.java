package classes;

import java.util.Scanner;

public class NomePersonalizado {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();


        System.out.println("\nOlá, " + nome + "! Que legal saber que você tem " + idade + " anos!");


        scanner.close();
    }
}
