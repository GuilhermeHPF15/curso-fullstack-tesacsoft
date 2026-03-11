package aula09;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        int num;
        int[] vetor = new int[5];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            num = leitor.nextInt();
            vetor[i] = num;
        }

        int resultado = 0;
        for (int i = 0; i < 5; i++) {
            resultado += vetor[i];
        }

        System.out.println(resultado);

        leitor.close();
    }
}
