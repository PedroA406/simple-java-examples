package classes;

import java.util.Scanner;

public class CaixaNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do saque: R$ ");
        int valor = sc.nextInt();

        if (valor < 5) {
            System.out.println("Valor mínimo para saque é R$5.");
        } else {
            int nota100 = valor / 100;
            valor %= 100;

            int nota50 = valor / 50;
            valor %= 50;

            int nota20 = valor / 20;
            valor %= 20;

            int nota10 = valor / 10;
            valor %= 10;

            int nota5 = valor / 5;
            valor %= 5;

            System.out.println("Notas fornecidas:");
            if (nota100 > 0) System.out.println("R$100: " + nota100);
            if (nota50 > 0) System.out.println("R$50: " + nota50);
            if (nota20 > 0) System.out.println("R$20: " + nota20);
            if (nota10 > 0) System.out.println("R$10: " + nota10);
            if (nota5 > 0) System.out.println("R$5: " + nota5);

            if (valor > 0) {
                System.out.println("Valor restante não pode ser sacado (R$" + valor + ").");
            }
        }

        sc.close();

    }
}
