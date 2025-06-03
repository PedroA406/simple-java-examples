package classes;

import java.util.Scanner;

public class SimOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Deseja continuar? (s/n): ");
            resposta = sc.next().toLowerCase(); // Garante que funcione com 'S' ou 's'
        } while (!resposta.equals("n"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
