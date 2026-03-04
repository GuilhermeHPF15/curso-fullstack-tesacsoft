package aula04;

/* Solicite um número inteiro ao utilizador. Verifique se o número é par ou ímpar. */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] arga) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }
    }
}
