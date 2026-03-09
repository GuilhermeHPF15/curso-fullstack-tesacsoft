package aula07;

/*
Cálculo do Fatorial:

Enunciado: Peça um número inteiro positivo ao utilizador e calcule o seu fatorial utilizando um ciclo for.
Exemplo:
Entrada: 5
Saída: 120 (porque 5 x 4 x 3 x 2 x 1 = 120)
 */

import java.util.Scanner;

public class ex006 {
    public static void main (String[] args) {
        int num, resultado = 1;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite um número para ver seu fatorial: ");
        num = leitor.nextInt();

        if (num < 0) {
            num *= -1;
        }

        for (int i = num; i >= 1; i--) {
            resultado *= i;
        }

        System.out.printf("O fatorial de %d é %d.%n", num, resultado);

        leitor.close();
    }
}
