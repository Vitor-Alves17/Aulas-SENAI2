package Aula8;

import java.util.Scanner;

public class Inguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Digite os 5 números da primeira array: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Digite os 5 númeos da segunda array: ");
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            if (a[i] == b[i]) {
                System.out.println("Posição " + i + ": " + a[i]);
            }
        }
    }
}
