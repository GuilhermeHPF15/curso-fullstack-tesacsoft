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
        String ingresso, dia, cliente;
        double descontado, desconto;
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("------- VENDA DE INGRESSOS -------\n1 = Normal\n2 = Estudante\n3 = Idoso\n");
        System.out.print("Sua escolha: ");
        ingresso = leitor.nextLine();

        System.out.print("Que dia da semana é Hoje? (1 = Domingo, 7 = sábado) ");
        dia = leitor.nextLine();

        switch (ingresso) {
            case "1": cliente = "normal"; desconto = 0; break;
            case "2": cliente = "estudante"; desconto = 50; break;
            case "3": cliente = "idoso"; desconto = 50; break;
            default: System.out.println("Opção inválida!"); return;
        }

        System.out.println("\nPreço do ingresso: 1000,00 Kz");

        if (desconto > 0) {
            System.out.println("Desconto de " + cliente + ": 50%");
        }

        if (dia.equals("4")) {
            desconto += 10;
            System.out.println("Desconto de quarta-feira: 10%");
        }

        descontado = 1000 - (1000 * desconto / 100);
        System.out.println("\nTotal a pagar: " + df.format(descontado) + " Kz");
    }
}
