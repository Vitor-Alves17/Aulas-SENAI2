package Aula7;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Digite um nota: ");

        nota = sc.nextDouble();
        if (nota < 4) {
            System.out.println("Reprovado");
        } else if (nota > 7) {
            System.out.println("Aprovado");
        }else if (nota <= 7 && nota >= 4) {
            System.out.println("Recuperação");
        }
    }
}
