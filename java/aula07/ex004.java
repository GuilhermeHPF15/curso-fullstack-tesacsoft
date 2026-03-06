package aula07;

/*
Soma de Intervalo:

Enunciado: Peça dois números ao utilizador (início e fim) e use um ciclo for para calcular e mostrar a soma de todos os
números nesse intervalo.
Exemplo:
Entrada: 3 e 6
Cálculo: 3 + 4 + 5 + 6
Saída: 18

 */

import java.util.Scanner;

public class ex004 {
    public static void main (String[] args) {
        int num1, num2, resultado = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        num1 = leitor.nextInt();

        System.out.print("Segundo número: ");
        num2 = leitor.nextInt();

        for (int i = num1; i <= num2; i ++) {
            resultado += i;
        }

        System.out.println(resultado);
    }
}
