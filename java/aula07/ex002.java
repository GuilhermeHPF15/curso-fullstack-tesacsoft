package aula07;

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
