package aula07;

import java.util.Scanner;

public class ex004 {
    public static void main (String[] args) {
        int num1, num2, resultado = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        num1 = leitor.nextInt();

        System.out.print("Segundo número: ");
        num2 = leitor.nextInt();

        for (int i = num1; i <= num2; i ++) {
            resultado += i;
        }

        System.out.println(resultado);
    }
}
