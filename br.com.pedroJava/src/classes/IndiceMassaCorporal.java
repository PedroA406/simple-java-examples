package classes;

import java.util.Scanner;

public class IndiceMassaCorporal {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu peso em quilogramas (ex: 70.5): ");
        double peso = scanner.nextDouble();


        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();


        double imc = peso / (altura * altura);


        System.out.println("\n--- Resultado do IMC ---");

        System.out.println("Seu IMC é: " + String.format("%.2f", imc));



    }

}
