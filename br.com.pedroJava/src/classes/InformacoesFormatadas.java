package classes;

import java.util.Scanner;

public class InformacoesFormatadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Possui CNH? (true/false): ");
        boolean possuiCNH = sc.nextBoolean();

        // Exibição formatada
        System.out.println("\n--- Informações da Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Possui CNH: " + (possuiCNH ? "Sim" : "Não"));

        sc.close();
    }
}
