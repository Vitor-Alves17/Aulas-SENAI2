package Aula8;

import java.util.Scanner;

public class Invert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[max] + " ");
            max--;
        }
    }
}
