package aula12;

/*
Conceito>

Faça uma função que recebe a média final de um aluno por parâmetro e retorna o seu conceito.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex004 {
    public static String conceito(double media) {
        if (media < 5) {
            return "D";
        } else if (media < 7) {
            return "C";
        } else if (media < 9) {
            return "B";
        } else {
            return "A";
        }
    }

    public static void main(String[] args) {
        double media;
        String conceito;
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Média final do aluno: ");
        media = leitor.nextDouble();

        conceito = conceito(media);
        System.out.printf("O conceito do aluno é %s.%n", conceito);
        leitor.close();
    }
}
