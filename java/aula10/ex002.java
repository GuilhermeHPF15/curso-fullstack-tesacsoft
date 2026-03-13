package aula10;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int num;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Número %d: ", i+1);
            vetor[i] = leitor.nextInt();
        }

        System.out.print("\nQual número você quer checar? ");
        num = leitor.nextInt();

        leitor.close();

        for (int i = 0; i < vetor.length; i++) {
            if (num == vetor[i]) {
                System.out.printf("%nO número %d existe dentro do vetor!%n", num);
                return;
            }
        }

        System.out.printf("O número %d não existe dentro do vetor!%n", num);
    }
}
