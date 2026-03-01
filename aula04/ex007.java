/* Peça ao utilizador o saldo atual da conta e o valor de uma compra. Se o saldo for maior ou igual ao valor da
compra, mostre: "Compra aprovada!". Caso contrário, mostre: "Saldo insuficiente.".
 */

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        int saldo, valor;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Saldo atual da sua conta em kwanzas: ");
        saldo = leitor.nextInt();
        System.out.print("Valor da compra em kwanzas: ");
        valor = leitor.nextInt();

        if (saldo >= valor) {
            System.out.println("Compra aprovada!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
