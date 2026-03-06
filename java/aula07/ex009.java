package aula07;

/*
Maior e Menor Valor Enunciado: Peça ao utilizador para inserir 5 números. Utilize um ciclo for para ler cada número e
descubra qual foi o maior e o menor valor digitado.
Exemplo:
Entrada: 10, 3, 25, 7, 12
Saída: Maior: 25, Menor: 3
 */

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        int num, maior, menor;
        Scanner leitor = new Scanner(System.in);

        maior = menor = 0;
        for (int i = 1; i<= 5; i++) {
            System.out.printf("Número %d: ", i);
            num = leitor.nextInt();
            if (i == 1) {
                maior = menor = num;
            } else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }

        System.out.printf("%nMaior: %d%nMenor: %d%n", maior, menor);

        leitor.close();
    }
}
