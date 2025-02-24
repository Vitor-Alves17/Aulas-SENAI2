package aula5;

import java.util.Scanner;

public class Caixaele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo, deposito, saque, res;

        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Qual ação deseja realizar? ");
        System.out.println("Para realizar saque digite 1 ");
        System.out.println("Para realizar deposito 2 ");
        System.out.println("Para consultar seu saldo digite 3: ");
        res = sc.nextDouble();

        if (res == 1) {
            System.out.println("Quanto deseja sacar? ");
            saque = sc.nextDouble();
            saldo = saldo - saque;
            System.out.println("Seu saldo após o saque é de R$ " + String.format("%.2f", saldo));
        } else if (res == 2) {
            System.out.println("Quanto deseja depositar? ");
            deposito = sc.nextDouble();
            saldo = saldo + deposito;
            System.out.println("Seu saldo após o depósito é de R$ " + String.format("%.2f", saldo));
        } else if (res == 3) {
            System.out.println("Seu saldo é de: " + String.format("%.2f", saldo));
        }

    }
}
