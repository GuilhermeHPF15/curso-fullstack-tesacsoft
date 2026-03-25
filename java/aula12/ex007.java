package aula12;

/*
Equação de segundo grau.

Exemplo de delta positivo: 1, -8 e 12.
Exemplo de delta 0: 1, -10 e 25.
Exemplo de delta negativo: 1, 2 e 5.
 */

import java.util.Scanner;

public class ex007 {
    public static int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static String equacaoSegundoGrau(int a, int b, int c) {
        int delta;
        double x1;
        delta = potencia(b, 2) -4 * a * c;

        if (delta < 0) {
            return "Não existem raízes reais!";
        }

        x1 = (-b + Math.sqrt(delta)) / (2 * a);

        if (delta == 0) {
            return "x = " + x1;
        } else {
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        String resposta;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        a = leitor.nextInt();
        System.out.print("Coeficiente b: ");
        b = leitor.nextInt();
        System.out.print("Coeficiente c: ");
        c = leitor.nextInt();

        resposta = equacaoSegundoGrau(a, b, c);
        System.out.println(resposta);

        leitor.close();
    }
}
