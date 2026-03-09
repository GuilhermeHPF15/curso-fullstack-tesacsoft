package aula07;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        int resultado = 0;
        for (; num > 0 ; num /= 10) {
            resultado += num % 10;
        }

        System.out.println(resultado);

        leitor.close();
    }
}
