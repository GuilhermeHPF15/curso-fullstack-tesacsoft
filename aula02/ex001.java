/* Conversão de temperatura: Peça au utilizador para digitar a temperatura em Celsius e converta para Fahrenheit. */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.util.Locale;

class ex001 {
    public static void main(String[] args) {
        double celcius;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.###", symbols);
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.println("------- CONVERSOR DE CELCIUS PARA FARENHEIT -------");
        System.out.print("Temperatura em Celcius: ");
        celcius = leitor.nextDouble();

        System.out.println(df.format(celcius) + "ºC é igual a " + df.format(celcius * 1.8 + 32) + "ºF");
    }
}