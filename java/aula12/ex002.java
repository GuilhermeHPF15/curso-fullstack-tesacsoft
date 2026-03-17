package aula12;

/*
Calcular média de três números:

Crie uma função que receba três números e retorne a média.
 */

import java.util.Scanner;
import java.util.Locale;

public class ex002 {
    public static double media(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double num1, num2, num3, media;
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Primeiro número: ");
        num1 = leitor.nextDouble();
        System.out.print("Segundo número: ");
        num2 = leitor.nextDouble();
        System.out.print("Tterceiro número: ");
        num3 = leitor.nextDouble();
        media = media(num1, num2, num3);

        System.out.printf("%nA média é %.2f", media);
        leitor.close();
    }
}
