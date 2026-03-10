package aula08;

import java.util.Scanner;

public class ex002b {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = leitor.nextInt(), original = num, invertido = 0;

        for (; num > 0; num = num / 10) { // enquanto num > 0
            int digito = num % 10;       // pega o ultimo dígito
            invertido = invertido * 10 + digito; // adiciona no invertido

            System.out.println(" numero sendo invertido --> " + invertido);
        }

        if (invertido == original) {
            System.out.println(original + " e capicua");
        } else {
            System.out.println(original + " nao e capicua");
        }
    }
}