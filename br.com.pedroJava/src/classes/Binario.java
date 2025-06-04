package classes;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("Binário: 0");
        } else {
            String binario = "";
            int n = numero;

            while (n > 0) {
                int resto = n % 2;
                binario = resto + binario; // Adiciona o dígito à esquerda
                n = n / 2;
            }

            System.out.println("Binário: " + binario);
        }

        sc.close();
    }
}
