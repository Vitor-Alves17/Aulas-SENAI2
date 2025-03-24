package Aula7;

import java.util.Scanner;

public class Erro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Esse código serve para fazer o rachamento de uma conta igualmente ");
        System.out.println("Digite o valor da conta: ");
        double a = sc.nextDouble();
        System.out.println("Digite a quantidade de pessoas que vão rachar: ");
        double b = sc.nextDouble();

        if (a == 0 || b == 0){
            System.out.println("Um ou os dois números são invalidos. Digite novamente: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
        } else {
            System.out.println(a / b);
        }

    }
}
