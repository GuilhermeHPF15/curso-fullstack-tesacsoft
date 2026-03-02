/*
Dia da Semana:

Crie um programa que peça ao utilizador para inserir um número inteiro entre 1 e 7. O programa deve exibir o nome do
dia correspondente (1 = domingo, 2 = segunda-feira, etc).
*/

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        String dia, diaSemana;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual é o dia da semana? (escolha de 1 a 7) " );
        dia = leitor.nextLine();

        switch (dia) {
            case "1": diaSemana = "domingo"; break;
            case "2": diaSemana = "segunda-feira"; break;
            case "3": diaSemana = "terça-feira"; break;
            case "4": diaSemana = "quarta-feira"; break;
            case "5": diaSemana = "quinta-feira"; break;
            case "6": diaSemana = "sexta-feira"; break;
            case "7": diaSemana = "sábado"; break;
            default: System.out.println("Dia inválido!"); return;
        }

        System.out.println("Hoje é " + diaSemana + "!");
    }
}