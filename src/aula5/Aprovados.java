package aula5;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n;

        System.out.println("Digite a nota do aluno: ");
        n = sc.nextDouble();

        if (n >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
