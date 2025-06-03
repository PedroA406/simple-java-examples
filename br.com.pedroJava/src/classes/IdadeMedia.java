package classes;

import java.util.Scanner;

public class IdadeMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, count = 0, idade;

        System.out.println("Digite idades (negativa para sair):");

        idade = sc.nextInt();
        while (idade >= 0) {
            soma += idade;
            count++;
            idade = sc.nextInt();
        }

        if (count > 0) {
            System.out.println("Média das idades: " + (soma / (double) count));
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }

    }
}
