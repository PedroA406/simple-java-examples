package classes;

import java.util.Scanner;

public class ContarAteN {
    public static void main(String[] args) {

        // 1. Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        int numeroLimite; // Variável para armazenar o número digitado pelo usuário

        // 2. Loop para garantir que o usuário digite um número inteiro positivo
        while (true) {
            System.out.print("Digite um número inteiro positivo: ");
            if (scanner.hasNextInt()) { // Verifica se a entrada é um número inteiro
                numeroLimite = scanner.nextInt();
                if (numeroLimite > 0) { // Verifica se o número é positivo
                    break; // Sai do loop se for um número positivo válido
                } else {
                    System.out.println("Erro: O número deve ser positivo. Tente novamente.");
                }
            } else {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Descarta a entrada inválida para evitar loop infinito
            }
        }

        System.out.println("\nContando de 1 até " + numeroLimite + ":");

        // 3. Laço de repetição para exibir os números de 1 até o númeroLimite
        for (int i = 1; i <= numeroLimite; i++) {
            System.out.println(i); // Exibe o número atual em cada iteração
        }


    }
}
