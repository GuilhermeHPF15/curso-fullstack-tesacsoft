package aula12;

/*
Peso ideal:

Faça uma função que recebe, por parâmetro, a altura e o sexo de uma pessoa e retorna o seu peso ideal. Para homens,
calcular o peso ideal usando a fórmula peso ideal = 72.7 x alt - 58 e, para mulheres, peso ideal = 62.1 x alt - 44.7
 */

import java.util.Locale;
import java.util.Scanner;

public class ex003 {
    public static double pesoIdeal(double altura, String sexo) {
        double resultado = 0;
        if (sexo.equals("M")) {
            resultado = 72.7 * altura - 58;
        }
        else if (sexo.equals("F")) {
            resultado = 62.1 * altura - 44.7;
        }

        return resultado;
    }

    public static void main(String[] args) {
        double altura, resultado;
        String sexo;
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Altura: ");
        altura = leitor.nextDouble();
        System.out.print("Sexo: ");
        sexo = leitor.next().toUpperCase();

        resultado = pesoIdeal(altura, sexo);
        System.out.printf("%nO peso ideal é %.2fKg", resultado);
    }
}
