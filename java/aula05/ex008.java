package aula05;

/*
Calculadora de Frete Logístico:

Uma transportadora cobra valores baseados na Zona de Entrega e no Peso da encomenda.
Passo 1: Escolha a Zona (1 = Norte, 2 = Centro, 3 = Sul).
Passo 2: Verifique o Peso (em Kg).
Zona Norte: Base 50 Kz. Se peso > 10Kg, adiciona 5 Kz por Kg excedente.
Zona Centro: Base 30 Kz. Se peso > 20Kg, adiciona 2 Kz por Kg excedente.
Zona Sul: Base 40 Kz. Sem taxa extra de peso.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex008 {
    public static void main(String [] args) {
        //Abrir leitor de inputs
        Scanner leitor = new Scanner(System.in);

        //Pedir zona de entrega
        System.out.print("1 = Norte\n2 = Centro\n3 = Sul\n\nEscolha a zona de entrega: ");
        String zona = leitor.nextLine();

        //Validar zona, atribuir custo base, peso limite e taxa por quilo excedente
        double custoBase, pesoLimite, taxa;
        switch (zona) {
            case "1": custoBase = 50; pesoLimite = 10; taxa = 5; break;
            case "2": custoBase = 30; pesoLimite = 20; taxa = 2; break;
            case "3": custoBase = 40; pesoLimite = 0; taxa = 0; break;
            default: System.out.println("\nZona inválida!"); leitor.close(); return;
        }

        //Pedir peso da encomenda
        System.out.print("Qual é o peso da encomenda? ");
        double peso = leitor.nextDouble();

        //Fechar leitor de inputs
        leitor.close();

        //Calcular peso excedente
        double pesoExtra = (peso > pesoLimite) ? peso - pesoLimite : 0;

        //Cálculo de custo final e saída com formatação monetária
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("%nO preço da encomenda será de %s Kz.%n", df.format((custoBase + taxa * pesoExtra)));
    }
}
