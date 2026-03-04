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
        Scanner leitor = new Scanner(System.in);
        double a, b, c;
        System.out.print("Lado A: ");
        a = leitor.nextDouble();
        System.out.print("Lado B: ");
        b = leitor.nextDouble();
        System.out.print("Lado C: ");
        c = leitor.nextDouble();
        leitor.close();

        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            System.out.println("Triângulo inválido!");
            return;
        }

        String triangulo;
        if (a == b && b == c) {
            triangulo = "equilátero!";
        } else if (a == b || b == c || a == c) {
            triangulo = "isósceles!";
        } else {
            triangulo = "escaleno!";
        }

        System.out.printf("%nO seu triângulo é %s.%n", triangulo);

        double a2 = a * a, b2 = b * b, c2 = c * c;
        if (a2 == b2 + c2 || b2 == a2 + c2 || c2 == b2 + a2) {
            System.out.println("E é um triângulo retângulo.");
        }
    }
}