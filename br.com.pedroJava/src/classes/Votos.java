package classes;

import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;

        System.out.println("Votação: Digite 1, 2 ou 3 para votar em um candidato. Digite -1 para encerrar.");

        while (true) {
            System.out.print("Seu voto: ");
            voto = sc.nextInt();

            if (voto == -1) {
                break;
            }

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                default:
                    System.out.println("Voto inválido! Digite apenas 1, 2, 3 ou -1 para sair.");
            }
        }

        System.out.println("\nResultado da votação:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");

        sc.close();
    }
}
