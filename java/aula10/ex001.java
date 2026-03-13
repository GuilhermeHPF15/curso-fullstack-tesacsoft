package aula10;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        int maior, menor;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Número %d: ", i);
            vetor[i] = leitor.nextInt();
        }

        maior = menor = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                maior = vetor[i];
                menor = vetor[i];
            } else if (vetor[i] > maior) {
                maior = vetor [i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.printf("O maior número é: %d%n", maior);
        System.out.printf("O menor número é: %d%n", menor);

        leitor.close();
    }
}
