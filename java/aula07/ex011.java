package aula07;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        int num, resultado = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = leitor.nextInt();

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            resultado += num / (int) Math.pow(10, i) % 10;
        }

        System.out.println(resultado);

        leitor.close();
    }
}
