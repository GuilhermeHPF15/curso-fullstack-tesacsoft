package aula06;

/*
Validador e Classificador de Triângulos:

Peça três valores ao utilizador: lados A, B e C. Primeiro, valide se eles formam um triângulo válido (a soma de dois
lados deve ser sempre maior que o terceiro). Se for válido, classifique-o:
- Equilátero (todos iguais).
- Isósceles (dois iguais).
- Escaleno (todos diferentes).
E verifique se é um triângulo retângulo usando o teorema de pitágoras (a² = b² + c²).
Objetivo: Utilizar operadores lógicos complexos (&&, ||) e matemática dentro de if.
Dica: A validação da existência do triângulo deve ser o primeiro if. Se falhar, nem possiga para a classificação.
 */

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        //Abrir leitor de inputs
        Scanner leitor = new Scanner(System.in);

        //Pedir lado A
        System.out.print("Lado A: ");
        double a = leitor.nextDouble();

        //Pedir lado B
        System.out.print("Lado B: ");
        double b = leitor.nextDouble();

        //Pedir lado C
        System.out.print("Lado C: ");
        double c = leitor.nextDouble();

        //Fechar leitor de inputs
        leitor.close();

        //Validar triângulo
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            System.out.println("\nTriângulo inválido!");
            return;
        }

        //Classificar triângulo
        String triangulo;
        if (a == b && b == c) {
            triangulo = "equilátero";
        } else if (a == b || b == c || a == c) {
            triangulo = "isósceles";
        } else {
            triangulo = "escaleno";
        }

        //Saída
        System.out.printf("%nO seu triângulo é %s!%n", triangulo);

        //Saída adicional caso seja um triângulo retângulo
        double a2 = a * a, b2 = b * b, c2 = c * c;
        if (a2 == b2 + c2 || b2 == a2 + c2 || c2 == a2 + b2) {
            System.out.println("E é um triângulo retângulo!");
        }
    }
}