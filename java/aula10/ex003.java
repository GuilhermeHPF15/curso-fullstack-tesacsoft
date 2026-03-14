package aula10;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int auxiliar, contador;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Número %d: ", i+1);
            vetor[i] = leitor.nextInt();
        }

        System.out.print("\nVetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }

        contador = 0;
        for (int i = vetor.length-1; contador <= (vetor.length-1) / 2; i--) {
            auxiliar = vetor[i];
            vetor[i] = vetor[contador];
            vetor[contador] = auxiliar;
            contador ++;
        }

        System.out.print("\nVetor invertido: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }

        leitor.close();
    }
}
