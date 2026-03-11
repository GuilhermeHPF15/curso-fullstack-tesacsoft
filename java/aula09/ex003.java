package aula09;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        int i = 0;
        while (i == 0) {
            System.out.println("while");
            break;
        }

        do {
            System.out.println("do while");
        } while (i == 0);
    }
}
