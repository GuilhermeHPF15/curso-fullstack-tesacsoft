package aula04;

/* Crie um sistema de login simples. Defina uma senha fixa no código (ex:123). Peça ao utilizador para digitar a
senha. Se estiver correta, mostre "Acesso permitido", se errar, mostre "Acesso negado". */

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senha, input;
        senha = 1234;

        System.out.print("Digite a senha: ");
        input = leitor.nextInt();

        if (input == senha) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
