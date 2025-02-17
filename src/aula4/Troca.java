package aula4;

import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,x;
        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        x = a;
        a = b;
        b = x;
        System.out.println("A=" + a + " B=" + b);
    }
}
