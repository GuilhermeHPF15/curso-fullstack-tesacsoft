/*
Semáforo Inteligente:

Peça ao utilizador para digitar a cor do semáforo ("V" para verde, "A" para amarelo e "P" para vermelho). Informe a
ação do motorista.
V="Acelerar", A="Atenção", P="Parar". Qualquer outro valor="Sinal quebrado"
 */

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        String semaforo;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é a cor do semáforo?\n\"V\" = Verde\n\"A\" = Amarelo\n\"P\" = Vermelho\n");
        System.out.print("Sua opção: ");
        semaforo = leitor.nextLine().toUpperCase();

        switch (semaforo) {
            case "V":
                System.out.println("Acelerar!");
                break;
            case "A":
                System.out.println("Atenção!");
                break;
            case "P":
                System.out.println("Parar!");
                break;
            default:
                System.out.println("Sinal quebrado!");
        }
    }
}
