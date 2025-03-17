package Aula3;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double x, y, soma;


        System.out.print("me dê um número ");
        x = sc.nextDouble();
        System.out.print("me dê outro número ");
        y = sc.nextDouble();

        soma = x + y;
        System.out.print("a soma é " + soma);
        sc.close();
    }
}
