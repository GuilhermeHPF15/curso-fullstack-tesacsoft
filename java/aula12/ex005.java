package aula12;

/*
Valor lógico:

Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna o valor lógico Verdadeiro caso o valor
seja primo e Falso em caso contrário.
 */

import java.util.Scanner;

public class ex005 {
    public static boolean verificarPrimo(int numero) {
        if (numero <= 1 || numero > 2 && numero % 2 == 0) {
            return false;
        }

        if (numero == 2) {
            return true;
        }

        for (int i = 3; i*i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numero;
        String output;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = leitor.nextInt();

        output = (verificarPrimo(numero)) ? "é primo!" : "não é primo!";
        System.out.printf("O número %d %s%n", numero, output);
        leitor.close();
    }
}
