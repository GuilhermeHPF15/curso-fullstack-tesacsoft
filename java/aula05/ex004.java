package aula05;

/*
Mês do Ano:

Solicite um número inteiro representando o mês (1 a 12). Informe o nome do mês e quantos dias ele tem (considere 28
para Fevereiro).
 */

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String mes;
        System.out.print("Digite o número do mês: ");
        mes = leitor.nextLine();

        leitor.close();

        String mesNome, dias;
        switch (mes) {
            case "1": mesNome = "Janeiro"; dias = "31"; break;
            case "2": mesNome = "Fevereiro"; dias = "28"; break;
            case "3": mesNome = "Março"; dias = "31"; break;
            case "4": mesNome = "Abril"; dias = "30"; break;
            case "5": mesNome = "Maio"; dias = "31"; break;
            case "6": mesNome = "Junho"; dias = "30"; break;
            case "7": mesNome = "Julho"; dias = "31"; break;
            case "8": mesNome = "Agosto"; dias = "31"; break;
            case "9": mesNome = "Setembro"; dias = "30"; break;
            case "10": mesNome = "Outubro"; dias = "31"; break;
            case "11": mesNome = "Novembro"; dias = "30"; break;
            case "12": mesNome = "Dezembro"; dias = "31"; break;
            default: System.out.println("\nMês inválido!"); return;
        }

        System.out.printf("%nVocê escolheu o mês de %s, que tem %s dias!%n", mesNome, dias);
    }
}
