package aula12;

import java.util.Scanner;

public class ex001 {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        num1 = leitor.nextInt();
        System.out.print("Segundo número: ");
        num2 = leitor.nextInt();
        resultado = somar(num1, num2);

        System.out.printf("%nA soma é igual a %d.%n", resultado);

        System.out.print("\nDigite a base: ");
        num1 = leitor.nextInt();
        System.out.print("Digite o expoente: ");
        num2 = leitor.nextInt();
        resultado = potencia(num1, num2);

        System.out.printf("%nA potência é igual a %d.%n", resultado);
        leitor.close();
    }
}
