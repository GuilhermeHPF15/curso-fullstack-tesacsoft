package aula05;

/*
Bilheteria de Cinema Inteligente:

Crie um sistema de venda de ingressos. Primeiro, peça o tipo de ingresso via menu (1=Normal, 2=Estudante, 3=Idoso). Em
seguida, peça o dia da semana (1 = Domingo a 7= Sábado).

Regras:
- Ingressos normais têm preço base de 1000 Kz.
- Estudantes e idosos têm 50% de desconto no preço base.
- Condição extra: Se o dia for quarta-feira (dia 4), todos os ingressos têm mais 10% de desconto adicional.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex007 {
    public static void main(String[] args) {
        //Abrir leitor de inputs, declarar custo base do ingresso
        double custoBase = 1000;
        Scanner leitor = new Scanner(System.in);

        //Pedir tipo de ingresso
        System.out.print("------ VENDA DE INGRESSOS ------\n1 = Normal\n2 = Estudante\n3 = Idoso\n\nSua escolha: ");
        String ingresso = leitor.nextLine();

        //Validar ingresso, atribuir cliente e desconto
        String cliente;
        double desconto;
        switch (ingresso) {
            case "1": cliente = "normal"; desconto = 0; break;
            case "2": cliente = "estudante"; desconto = 50; break;
            case "3": cliente = "idoso"; desconto = 50; break;
            default: System.out.println("\nOpção inválida!"); leitor.close(); return;
        }

        //Pedir dia da semana
        System.out.print("Que dia da semana é Hoje? (1 = Domingo, 7 = sábado) ");
        String dia = leitor.nextLine();

        //Fechar leitor de inputs
        leitor.close();

        //Criar formatação monetária
        DecimalFormat kwanzas = new DecimalFormat("0.00");

        //Saída do custo base do ingresso
        System.out.printf("%nPreço do ingresso: %s Kz.%n", kwanzas.format(custoBase));

        //Saída do desconto do cliente (caso tenha)
        if (desconto > 0) {
            System.out.printf("Desconto de %s: %d%%." ,cliente, (int) desconto);
        }

        //Saída do desconto de quarta-feira (caso seja quarta-feira)
        if (dia.equals("4")) {
            desconto += 10;
            System.out.println("\nDesconto de quarta-feira: 10%");
        }

        //Cálcular custo final
        double custoFinal = custoBase - (custoBase * desconto / 100);

        //Saída do custo final
        System.out.printf("%nTotal a pagar: %s Kz.%n", kwanzas.format(custoFinal));
    }
}
