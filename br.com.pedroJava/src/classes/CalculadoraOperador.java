package classes;

import java.util.Scanner;

public class CalculadoraOperador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        double resultado;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                    operacaoValida = false;
                    resultado = 0;
                } else {
                    resultado = num1 / num2;
                }
                break;

            default:
                System.out.println("Operador inválido.");
                operacaoValida = false;
                resultado = 0;
        }

        if (operacaoValida) {
            System.out.printf("Resultado: %.2f\n", resultado);
        }

        sc.close();

    }
}
