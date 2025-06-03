package classes;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        // 1. Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // 2. Solicita e lê um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt(); // Lê um número inteiro


        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }


    }
}
