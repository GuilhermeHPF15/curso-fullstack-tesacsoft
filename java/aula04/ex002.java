package aula04;

/* Crie um programa que peça a idade do utilizador. Se a idade for maior ou igual a 18, informe que a pessoa é "maior
de idade". Caso contrário, informe que é "menor de idade". */

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
