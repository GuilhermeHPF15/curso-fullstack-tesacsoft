package aula11;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        int[] original = new int[5];
        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Número %d: ", i);
            original[i-1] = leitor.nextInt();
        }

        leitor.close();

        for (int i = 0; i < original.length; i++) {
            if (original[i] != original[original.length-i-1]) {
                System.out.println("O vetor não é palíndromo!");
                return;
            }
        }

        System.out.println("O vetor é palíndromo!");
    }
}
