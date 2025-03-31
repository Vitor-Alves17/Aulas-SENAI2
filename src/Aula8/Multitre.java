package Aula8;

import java.util.Scanner;

public class Multitre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista = new int[5];
        for (int i = 0; i < 5; i++) {
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(lista[i] * 3);
        }
    }
}
