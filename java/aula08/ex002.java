package aula08;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt(), num2 = num, original = num;

        int magnitude = 1;
        for (int i = 0; num > 0; num /= 10, i++) {
            if (i != 0) {
                magnitude *= 10;
            }
        }

        int algarismo1 = 0, algarismo2 = 0, invertido = 0;
        for (; num2 > 0; num2 /= 10) {
            algarismo1 = num2 % 10;
            algarismo2 = algarismo1 * magnitude;
            invertido += algarismo2;
            magnitude /= 10;
        }

        System.out.printf("%nO número %d ao contrário é %d.%n", original, invertido);

        if (invertido == original) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }

        leitor.close();
    }
}
