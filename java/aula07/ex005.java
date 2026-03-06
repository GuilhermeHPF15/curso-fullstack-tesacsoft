package aula07;

import java.util.Scanner;

public class ex005 {
    public static void main (String[] args) {
        int base, expoente, resultado;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Base: ");
        base = leitor.nextInt();
        System.out.print("Expoente ");
        expoente = leitor.nextInt();

        resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.printf("%nResultado: %d%n", resultado);
    }
}
