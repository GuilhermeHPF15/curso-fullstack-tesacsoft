package aula09;

/*
Contagem de 1 a 10 com do while.
 */

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        int x = 1;

        do {
            System.out.println(x);
            x += 1;
        } while (x <= 10);
    }
}
