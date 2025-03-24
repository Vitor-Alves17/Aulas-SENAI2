package Aula6;

import java.util.Scanner;

public class Tabu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i = 0;

        System.out.println("Digite um numero: ");
        n = sc.nextInt();

        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }
    }
}
