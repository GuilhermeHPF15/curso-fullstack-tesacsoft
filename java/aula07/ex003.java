package aula07;

import java.util.Scanner;

public class ex003 {
    public static void main (String [] args) {
        int num, limite;

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nEscolha um número de 1 a 10 para ver sua tabuada: ");
        num = leitor.nextInt();

        System.out.print("Multiplicaremos até qual número? ");
        limite = leitor.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.printf("%d * %d = %d%n", i, num, i * num);
        }

        leitor.close();
    }
}
