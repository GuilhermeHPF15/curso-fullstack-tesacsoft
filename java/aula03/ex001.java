package aula03;

public class ex001 {
    public static void main(String[] args) {
        int a, b, c;

        a = 1;
        b = 2;
        c = a;
        System.out.println("A variável 'a' vale " + a);
        System.out.println("A variável 'b' vale " + b);
        System.out.println("------- EXECUTANDO TROCA -------");
        a = b;
        b = c;
        System.out.println("A variável 'a' vale " + a);
        System.out.println("A variável 'b' vale " + b);
    }
}
