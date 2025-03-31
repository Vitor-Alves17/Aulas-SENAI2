package Aula8;

import java.util.Scanner;

public class Manormaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 100;

        int mame[] = new int[8];
        for (int i = 0; i < mame.length; i++) {
            mame[i] = input.nextInt();
        }
        for (int i = 0; i < mame.length; i++) {
            if (a < mame[i]) {
                a = mame[i];
            }
            if (b > mame[i]) {
                b = mame[i];
            }
        }
        System.out.println("O menor número da array é " + a);
        System.out.println("O menor número da array é " + b);

    }
}
