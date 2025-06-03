package classes;

import java.util.Scanner;

public class SomaSubtracaoDivisao {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();


        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();


        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        double divisao;



        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (numero2 != 0) {
            divisao = (double) numero1 / numero2;
            System.out.println("Divisão: " + String.format("%.2f", divisao)); // Formata para 2 casas decimais
        } else {
            System.out.println("Divisão: Indefinida (divisão por zero)");


        }



    }
}
