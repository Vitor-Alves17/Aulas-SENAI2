package aula4;

import java.util.Scanner;

public class Lata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, altura, volume;
        double pi = 3.14159;
        System.out.print("Me fale o raio(cm): ");
        raio = sc.nextDouble();
        System.out.print("Me fale a altura(cm): ");
        altura = sc.nextDouble();
        volume = pi * (raio * raio) * altura;
        System.out.println("volume: " + String.format("%.2f", volume) + "cm²");
    }
}
