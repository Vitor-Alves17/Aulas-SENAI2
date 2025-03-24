package Aula7;

import java.util.Scanner;

public class Somu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Digite um valor: ");
        a = sc.nextDouble();
        b = a;
        for (int i = 1;i <= 5; i++ ) {
        a = (a * b) * 2;
        }
        System.out.println(a);
    }
}
