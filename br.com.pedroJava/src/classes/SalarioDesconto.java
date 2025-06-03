package classes;

import java.util.Scanner;

public class SalarioDesconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = sc.nextDouble();
        double novoSalario;

        if (salario < 2000) {
            novoSalario = salario * 1.10; // aumento de 10%
        } else {
            novoSalario = salario * 1.05; // aumento de 5%
        }

        System.out.printf("O novo salário com reajuste é: R$ %.2f\n", novoSalario);

        sc.close();

    }
}
