package aula08;

/*
Soma apenas dos números ímpares:

Enunciado:
Peça ao utilizador um número limite e utilize um for para calcular a soma de todos os números ímpares de 1 até esse
número.
 */

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        int resultado = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                resultado += i;
            }
        }

        System.out.printf("%nResultado: %d.%n", resultado);
    }
}
