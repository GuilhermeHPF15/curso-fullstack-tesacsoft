/*
Menu de Opções:

Exiba um menu simples: "1. Iniciar Jogo", "2. Carregar Jogo", "3. Sair". Peça ao utilizador para escolher uma ação.
 */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        String escolha;
        Scanner leitor = new Scanner(System.in);

        System.out.println("1. Iniciar Jogo\n2. Carregar Jogo\n3. Sair\n");
        System.out.print("Sua escolha: ");
        escolha = leitor.nextLine();

        switch (escolha) {
            case "1": System.out.println("Jogo iniciado!"); break;
            case "2": System.out.println("Jogo carregado!"); break;
            case "3": System.out.println("Jogo encerrado!"); break;
            default: System.out.println("Opção inválida!");
        }
    }
}
