package Aula8;

import java.util.Scanner;

public class Separa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            }
        System.out.println("Números pares: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Números impares: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
