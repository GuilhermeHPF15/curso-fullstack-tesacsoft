package aula05;

/*
Categoria de Produto:

Em um supermercado, os produtos têm código de categoria: "A" (alimentação), "L" (limpeza), "H" (higiene). Peça o
código, mostre o nome da categoria e se possui desconto (somente "A" tem 5% de desconto).
 */

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        String codigo, categoria, msgDesconto;
        int desconto = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma categoria:\n\"A\" = Alimentação\n\"L\" = Limpeza\n\"H\" = Higiene\n");
        System.out.print("Sua opção: ");
        codigo = leitor.nextLine().toUpperCase();

        switch (codigo) {
            case "A": categoria = "alimentação"; desconto = 5; break;
            case "L": categoria = "limpeza"; break;
            case "H": categoria = "higiene"; break;
            default: System.out.println("Código de categoria inválido!"); return;
        }

        msgDesconto = (desconto > 0) ? "terão " + desconto + "% de desconto." : "não terão desconto.";
        System.out.println("Categoria de " + categoria + ". Os produtos " + msgDesconto);
    }
}
