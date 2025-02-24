package aula5;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextDouble();

        if (a > b) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
