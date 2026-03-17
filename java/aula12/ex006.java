package aula12;

/*
Faça um procedimento que recebe 2 vetores A e B de tamanho 10 de inteiros, por parâmetro. Ao final do procedimento, B
deve conter o fatorial de cada elemento de A. O vetor B deve retornar alterado.
 */

import java.util.Scanner;

public class ex006 {
    public static int[] vetorFatorial(int[] vetorA) {
        int[] vetorB = new int[10];
        int fatorial;

        for (int i = 0; i < vetorA.length; i++) {
            fatorial = 1;
            for (int j = 1; j <= vetorA[i]; j++) {
                fatorial *= j;
            }
            vetorB[i] = fatorial;
        }

        return vetorB;
    }

    public static void main(String[] args) {
        //Declaração de variáveis e abertura do leitor
        int[] vetorA = new int[10];
        int[] vetorFatorial = new int[10];
        Scanner leitor = new Scanner(System.in);

        //Leitura dos valores do vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Número %d: ", i+1);
            vetorA[i] = leitor.nextInt();
        }

        //Chamada da função e output
        vetorFatorial = vetorFatorial(vetorA);
        System.out.println("\nAqui está a lista dos números digitados e seus fatoriais:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d! = %d%n", vetorA[i], vetorFatorial[i]);
        }

        //Fechamento do leitor
        leitor.close();
    }
}
