package aula02;

/* Área de um retângulo: Peça a largura e a altura de um retângulo e calcule a área. */

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ex002 {
    public static void main(String[] args) {
        double largura, altura;
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.##", symbols);

        System.out.println("------- ÁREA DE UM RETÂNGULO -------");
        System.out.print("Largura do retângulo em centímetros: ");
        largura = leitor.nextDouble();
        System.out.print("Altura do retângulo em centímetros: ");
        altura = leitor.nextDouble();

        System.out.println("A área do retângulo é de " + df.format(largura * altura) + "cm².");
    }
}
