package aula5;

import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ano;
        System.out.println("Digite o ano: ");
        ano = sc.nextDouble();
        if (ano % 4 == 0) {
            System.out.println("Bissexto");
        }else {
            System.out.println("Não é bissexto");
        }

    }
}
