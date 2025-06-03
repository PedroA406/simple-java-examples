package classes;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, maior, menor;

        System.out.print("Digite um número (0 para encerrar): ");
        numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            maior = menor = numero;

            while (true) {
                System.out.print("Digite outro número (0 para encerrar): ");
                numero = sc.nextInt();

                if (numero == 0) break;

                if (numero > maior) maior = numero;
                if (numero < menor) menor = numero;
            }

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }


    }
}
