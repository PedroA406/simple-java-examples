package classes;

import java.util.Scanner;

public class AprovadoRecuperacaoReprovado {
    public static void main(String[] args) {
        // 1. Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // 2. Solicita e lê a nota do aluno
        System.out.print("Digite a nota do aluno (use vírgula para decimais, ex: 7,5): ");
        double nota = scanner.nextDouble(); // Lê um número decimal (double)

        // 3. Verifica a situação do aluno com base na nota
        if (nota >= 7.0) {
            System.out.println("O aluno está APROVADO! Parabéns!");
        } else if (nota >= 5.0) {
            System.out.println("O aluno está em RECUPERAÇÃO. Foco nos estudos!");
        } else {
            System.out.println("O aluno está REPROVADO. É hora de revisar o conteúdo!");
        }

        // 4. Fecha o objeto Scanner
        scanner.close();
    }
}
