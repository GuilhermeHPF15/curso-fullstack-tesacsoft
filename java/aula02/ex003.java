package aula02;

/* Antecessor e sucessor: peça um número ao utilizador e apresente seu sucessor e seu antecessor */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("------- ANTECESSOR E SUCESSOR -------");
        System.out.print("Digite um número: ");
        numero = leitor.nextInt();
        System.out.println("O número digitado foi: " + numero);
        System.out.println("Seu antecessor é: " + (numero - 1));
        System.out.println("Seu sucessor é: " + (numero + 1));
    }
}
