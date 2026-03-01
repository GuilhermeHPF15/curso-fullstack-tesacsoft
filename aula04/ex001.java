import java.util.Scanner;
import java.util.Locale;

class ex001 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        media = ((nota1 + nota2) / 2);

        System.out.println("Média = " + media);

        if (media >= 10) {
            System.out.println("Estudante aprovado");
        } else {
            System.out.println("Estudante reprovado");
        }
    }
}