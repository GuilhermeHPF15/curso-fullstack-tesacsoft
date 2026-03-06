package aula07;

/*
Tabuada:

Peça ao utilizador um número inteiro e utilize um ciclo for para mostrar a tabuada desse número (de 1 a 10).
Exemplo:
Entrada: 5
Saída:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Scanner;

public class ex002 {
    public static void main (String [] args) {
        int num;

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nEscolha um número de 1 a 10 para ver sua tabuada: ");
        num = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", i, num, i * num);
        }

        leitor.close();
    }
}
