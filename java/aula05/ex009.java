package aula05;

/*
Estacionamento com Tarifação Variável:

Gere o ticket de saída de um estacionamento.
Passo 1 (Switch): Tipo de Veículo (1 = Moto, 2 = Carro, 3 = Camionete).
Moto: 5 Kz/hora.
Carro: 10 Kz/hora.
Camionete: 15 Kz/hora.
Passo 2 (If): Tempo de Permanência (horas inteiras).
Se permanecer mais de 5 horas, aplica-se um teto máximo de 50 Kz para Motos e 80 Kz para Carros/Camionetes.
Se permanecer menos de 15 minutos (0 horas), é grátis
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class ex009 {
    public static void main(String [] args) {
        String veiculo;
        double custo, taxa, teto, minutos;
        int horas;
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        DecimalFormat kwanzas = new DecimalFormat("0.00");

        System.out.println("1 = Moto\n2 = Carro\n3 = Camionete\n");
        System.out.print("Qual é o seu veículo? ");
        veiculo = leitor.nextLine();

        switch (veiculo) {
            case "1": taxa = 5; teto = 50; break;
            case "2": taxa = 10; teto = 80; break;
            case "3": taxa = 15; teto = 80; break;
            default: System.out.println("Veículo inválido!"); return;
        }

        System.out.print("Quantos minutos o seu veículo ficou estacionado? ");
        minutos = leitor.nextDouble();

        horas = (int) minutos / 60;

        if (horas > 5) {
            custo = teto;
        } else if (minutos < 15) {
            custo = 0;
        } else {
            custo = taxa * horas;
        }

        System.out.println("\nPreço do estacionamento: " + kwanzas.format(custo) + " Kz");
    }
}
