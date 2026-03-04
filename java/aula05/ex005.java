package aula05;

/*
Semáforo Inteligente:

Peça ao utilizador para digitar a cor do semáforo ("V" para verde, "A" para amarelo e "P" para vermelho). Informe a
ação do motorista.
V="Acelerar", A="Atenção", P="Parar". Qualquer outro valor="Sinal quebrado"
 */

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é a cor do semáforo?\n\"V\" = Verde\n\"A\" = Amarelo\n\"P\" = Vermelho\n");

        String semaforo;
        System.out.print("Sua opção: ");
        semaforo = leitor.nextLine().toUpperCase();

        leitor.close();

        String acao;
        switch (semaforo) {
            case "V": acao = "Acelerar"; break;
            case "A": acao = "Atenção"; break;
            case "P": acao = "Parar"; break;
            default: System.out.println("Sinal quebrado!"); return;
        }

        System.out.printf("%n%s!%n", acao);
    }
}
