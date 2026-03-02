/*
Calculadora de Frete Logístico:

Uma transportadora cobra valores baseados na Zona de Entrega e no Peso da encomenda.
Passo 1 (Switch): Escolha a Zona (1 = Norte, 2 = Centro, 3 = Sul).
Passo 2 (If): Verifique o Peso (em Kg).
Zona Norte: Base 50 Kz. Se peso > 10Kg, adiciona 5 Kz por Kg excedente.
Zona Centro: Base 30 Kz. Se peso > 20Kg, adiciona 2 Kz por Kg excedente.
Zona Sul: Base 40 Kz. Sem taxa extra de peso.
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class ex008 {
    public static void main(String [] args) {
        String zona;
        double peso, pesoLimite, pesoExtra, custoBase, taxa;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.println("1 = Norte\n2 = Centro\n3 = Sul\n");
        System.out.print("\nEscolha a zona de entrega: ");
        zona = leitor.nextLine();
        System.out.print("\nQual é o peso da encomenda? ");
        peso = leitor.nextDouble();

        switch (zona) {
            case "1": custoBase = 50; pesoLimite = 10; taxa = 5; break;
            case "2": custoBase = 30; pesoLimite = 20; taxa = 2; break;
            case "3": custoBase = 40; pesoLimite = peso; taxa = 0; break;
            default: System.out.println("Zona inválida!"); return;
        }

        pesoExtra = (peso > pesoLimite) ? peso - pesoLimite : 0;

        System.out.println("O preço da encomenda será de " + df.format((custoBase + taxa * pesoExtra)) + " Kz");
    }
}
