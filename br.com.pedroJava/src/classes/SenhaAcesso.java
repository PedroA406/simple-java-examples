package classes;

import java.util.Scanner;

public class SenhaAcesso {

    private static final String SENHA_CADASTRADA = "s1234";

    public static void main(String[] args) {

        // 1. Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // 2. Solicita a senha ao usuário
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine(); // Lê a senha digitada

        // 3. Verifica se a senha digitada corresponde à senha cadastrada
        // Usamos .equals() para comparar Strings, nunca ==
        if (senhaDigitada.equals(SENHA_CADASTRADA)) {
            System.out.println("Login bem-sucedido! Bem-vindo!");
        } else {
            System.out.println("Senha incorreta. Acesso negado.");
        }

        // 4. Fecha o objeto Scanner
        scanner.close();
    }
}
