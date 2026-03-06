package aula07;

/*
Sequência de Fibonacci:

Enunciado: Peça ao utilizador quantos termos da sequência ele quer ver. Use um ciclo for para gerar e imprimir a
sequência (começando em 0 e 1, somando os anteriores).
Exemplo:
Entrada: 6
Saída: 0, 1, 1, 2, 3, 5
 */

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        int termos, num1, num2, holder;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n----- SEQUÊNCIA DE FIBONACCI -----\nNúmero de termos: ");
        termos = leitor.nextInt();
        leitor.close();

        if (termos == 1) {
            System.out.println("\n0");
            return;
        }

        System.out.print("\n0, 1");

        if (termos == 2) {
            return;
        }

        num1 = 0;
        num2 = 1;
        for (int i = 3; i <= termos; i++) {
            holder = num2;
            num2 += num1;
            num1 = holder;
            System.out.printf(", %d", num2);
        }
    }
}
