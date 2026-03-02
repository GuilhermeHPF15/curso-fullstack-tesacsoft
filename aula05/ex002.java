/*
Calculadora Simples:

Peça ao utilizador dois números e um operador matemático (+, -, *, /). Realize a operação correspondente e mostre o
resultado.
 */

import java.util.Locale;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        double num1, num2;
        String n1f, n2f, operador;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.##", symbols);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Primeiro número: ");
        num1 = leitor.nextDouble();
        n1f = df.format(num1);
        System.out.print("Operador: ");
        operador = leitor.next();
        System.out.print("Segundo número: ");
        num2 = leitor.nextDouble();
        n2f = df.format(num2);

        switch (operador) {
            case "+":
                System.out.println(n1f + " + " + n2f + " = " + df.format((num1 + num2)));
                break;
            case "-":
                System.out.println(n1f + " - " + n2f + " = " + df.format((num1 - num2)));
                break;
            case "*":
                System.out.println(n1f + " * " + n2f + " = " + df.format((num1 * num2)));
                break;
            case "/":
                System.out.println(n1f + " / " + n2f + " = " + df.format((num1 / num2)));
                break;
            default:
                System.out.println("Operador inválido!");
        }
    }
}
