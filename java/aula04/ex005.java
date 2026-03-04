package aula04;

/* Peça o valor de uma compra. Se o valor for superior a R$100,00, o cliente ganha 10% de desconto. Caso contrário,
paga o valor total. Mostre o valor final a pagar. */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex005 {
    public static void main(String[] args) {
        double valor;

        Scanner leitor = new Scanner(System.in);
        DecimalFormat reais = new DecimalFormat("0.00");

        System.out.print("Qual é o valor da compra? ");
        valor = leitor.nextDouble();

        if (valor > 100) {
            System.out.println("O preço da sua compra terá 10% de desconto!");
            System.out.println("Você deve pagar R$" + reais.format((valor - (valor * 10 / 100))));
        } else {
            System.out.println("Preço normal. Você deve pagar R$" + reais.format(valor) + ".");
        }
    }
}
