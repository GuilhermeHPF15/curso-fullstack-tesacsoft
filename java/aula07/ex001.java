package aula07;

public class ex001 {
    public static void main (String[] args) {
        //Contagem de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.print("\n");

        //Contagem de 5 a 0
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.print("\n");

        //Contagem dos pares de 0 a 10
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
