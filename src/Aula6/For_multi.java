package Aula6;

import java.util.Scanner;

public class For_multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        b = a;
        for (int i = a - 1; i > 0; i--) {
            a = b * i;
            b = a;
        }
        System.out.println(a);
    }
}
