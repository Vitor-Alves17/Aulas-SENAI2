package Aula6;

import java.util.Scanner;

public class For_soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, c;
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        c = a;
        b = 1;
        for (int i = 1; i < c; i++) {
            a = b + i;
            b = a;
        }
        System.out.println(a);
    }
}
