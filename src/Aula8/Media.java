package Aula8;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;

        double[] notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
            a += notas[i];
        }
        for (int i = 0; i < notas.length; i++) {
        b = a / notas.length;
        }
        System.out.println("Média: " + String.format("%.2f", b));
        if (b >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
