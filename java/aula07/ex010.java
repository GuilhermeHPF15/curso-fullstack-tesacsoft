/*
Soma dos Dígitos:

Enunciado: Peça um número inteiro ao utilizador e utilize um ciclo for (iterando sobre a string do
número) para calcular a soma de todos os seus dígitos.
Exemplo: Entrada: 1234 Cálculo: 1 + 2 + 3 + 4
Saída: 10
 */

package aula07;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        String num;
        int resultado = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = leitor.nextLine();

        for (int i = 0; i < num.length(); i++) {
            resultado += Character.getNumericValue(num.charAt(i));
        }

        System.out.println(resultado);

        leitor.close();
    }
}
