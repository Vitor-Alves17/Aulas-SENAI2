package aula5;

import java.util.Scanner;

public class Poneze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        System.out.println("Digite um valor: ");
        a = sc.nextDouble();

        if (a > 0) {
            System.out.println("Positivo");
        }else if (a < 0) {
            System.out.println("Negativo");
        }else if (a == 0) {
            System.out.println("Zero");
        }
    }
}
