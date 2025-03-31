package Aula8;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;

        int[] par = new int[15];
        for (int i = 0; i < par.length; i++) {
            par[i] = sc.nextInt();
        }
        for (int i = 0; i < par.length; i++) {
            if (par[i] % 2 == 0) {
                p++;
            }
        }
        System.out.println("Na lista há " + p + " números pares");
    }
}
