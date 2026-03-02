/*
Dia da Semana:

Crie um programa que peça ao utilizador para inserir um número inteiro entre 1 e 7. O programa deve exibir o nome do
dia correspondente (1 = domingo, 2 = segunda-feira, etc).
*/

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        int dia;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual é o dia da semana? (escolha de 1 a 7) " );
        dia = leitor.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda-feira!");
                break;
            case 3:
                System.out.println("Hoje é terça-feira!");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira!");
                break;
            case 5:
                System.out.println("Hoje é quinta-feira!");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira!");
                break;
            case 7:
                System.out.println("Hoje é sábado!");
                break;
            default:
                System.out.println("Da inválido!");
        }
    }
}