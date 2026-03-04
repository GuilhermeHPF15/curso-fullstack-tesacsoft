/*
Menu de Opções:

Exiba um menu simples: "1. Iniciar Jogo", "2. Carregar Jogo", "3. Sair". Peça ao utilizador para escolher uma ação.
 */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String escolha;
        System.out.println("1. Iniciar Jogo\n2. Carregar Jogo\n3. Sair\n");
        System.out.print("Sua escolha: ");
        escolha = leitor.nextLine();

        leitor.close();

        String jogo;
        switch (escolha) {
            case "1": jogo = "iniciado"; break;
            case "2": jogo = "carregado"; break;
            case "3": jogo = "finalizado"; break;
            default: System.out.println("\nOpção inválida!"); return;
        }

        System.out.printf("%nJogo %s!%n", jogo);
    }
}
