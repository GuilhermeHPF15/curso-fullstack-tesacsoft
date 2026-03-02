/* Um radar de velocidade limita a via a 80km/h. Peça a velocidade do carro. Se a velocidade for superior a 60km/h,
calcule uma multa de acordo com a taxa em ucf, caso contrário, mostre: "Velocidade dentro do limite. Boa viagem!".
Valores da taxa:
se a velocidade for de 61 a 70, a taxa será 110 UCF
se a velocidade for de 71 a 80, a taxa será 240 UCF
se a velocidade for superior a 80, a taxa será 300 UCF
multa = taxa * 88 */

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class ex006 {
    public static void main(String[] args) {
        double velocidade;
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Qual é a velocidade do carro? ");
        velocidade = leitor.nextDouble();

        if (velocidade <= 60) {
            System.out.println("Velocidade dentro do limite. Boa viagem!");
        } else if (velocidade <= 70) {
            System.out.println("Excesso de velocidade! Você deve uma multa de " + df.format((110 * 88)) + " Kz");
        } else if (velocidade <= 80){
            System.out.println("Excesso de velocidade! Você deve uma multa de " + df.format((240 * 88)) + " Kz");
        } else {
            System.out.println("Excesso de velocidade! Você deve uma multa de " + df.format((300 * 88)) + " Kz");
        }
    }
}
