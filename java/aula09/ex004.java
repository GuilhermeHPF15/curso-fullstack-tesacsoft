package aula09;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        int num;
        int[] vetor = new int[5];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            num = leitor.nextInt();
            vetor[i] = num;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }

        leitor.close();
    }
}
