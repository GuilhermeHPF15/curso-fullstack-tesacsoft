package aula07;

import java.util.Scanner;

public class ex010d {
    public static void main(String[] args) {
        int num, casa, resultado = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = leitor.nextInt();

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            casa = 1;
            for (int a = 1; a <= i; a++) {
                casa *= 10;
            }
            resultado += num / casa % 10;
        }

        System.out.println(resultado);

        leitor.close();
    }
}
