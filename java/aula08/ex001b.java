package aula08;

/*
Versão otimizada do Gelson.
 */

import java.util.Scanner;

public class ex001b {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        int resultado = 0;
        for (int i = 1; i <= num; i += 2) {
            resultado += i;
        }

        System.out.printf("%nResultado: %d.%n", resultado);
    }
}
