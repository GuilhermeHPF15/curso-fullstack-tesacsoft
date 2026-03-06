package aula07;

/*
Cálculo de Potência (Expoente):

Enunciado: Peça ao utilizador um número base e um número expoente. Utilize um ciclo for para calcular a potência
(multiplicando a base por ela mesma o número de vezes do expoente) sem usar a função de potência pronta.
Exemplo:
Entrada: Base 2, Expoente 3
Cálculo: 2 x 2 x 2
Saída: 8

 */

import java.util.Scanner;

public class ex005 {
    public static void main (String[] args) {
        int base, expoente, resultado;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Base: ");
        base = leitor.nextInt();
        System.out.print("Expoente ");
        expoente = leitor.nextInt();

        resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.printf("%nResultado: %d%n", resultado);
    }
}
