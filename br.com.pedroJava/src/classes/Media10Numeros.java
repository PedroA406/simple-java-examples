package classes;

import java.util.Scanner;

public class Media10Numeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidadeDeNumeros = 10;

        System.out.println("Por favor, digite 10 números inteiros:");


        for (int i = 1; i <= quantidadeDeNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma = soma + numero;
        }


        double media = (double) soma / quantidadeDeNumeros;


        System.out.println("\n--- Resultado ---");
        System.out.println("A soma dos números é: " + soma);

        System.out.println("A média dos 10 números é: " + String.format("%.2f", media));


    }
}
