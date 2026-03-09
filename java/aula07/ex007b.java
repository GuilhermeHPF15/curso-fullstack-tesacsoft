package aula07;

/*
Pirâmide de Asteriscos:

Enunciado: Peça um número ao utilizador para definir a altura e desenhe uma pirâmide de asteriscos usando ciclos for.
Exemplo:
Entrada: 3
Saída:
*
**
***
*/

import java.util.Scanner;

public class ex007b {
    public static void main (String[] args) {
        int altura;
        String asterisco = "*";
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nAltura da pirâmide: ");
        altura = leitor.nextInt();
        System.out.print("\n");

        for (int i = 1; i <= altura; i++) {
            System.out.println(asterisco.repeat(i));
        }

        leitor.close();
    }
}
